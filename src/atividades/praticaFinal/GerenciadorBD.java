package atividades.praticaFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GerenciadorBD {
	
	private final String url = "jdbc:postgresql://localhost/praticaFinal";
	private final String user = "postgres";
	private final String password = "pauloegol23";
	Connection conn = null;
	PreparedStatement statement;
	int id;
	String local, data, nome, obs, tipo;
	String tabela;
	
	
	public Connection connect() throws SQLException {
	
		conn = DriverManager.getConnection(url, user, password);
		
		if(conn != null){
			System.out.println("Conexão ao Banco de dados feita com sucesso");
		}else {
			System.out.println("Conexão ao Banco de dados falho!!!!");
		}
		
		//versão do postgreeSQL
		Statement statement = (Statement) conn.createStatement();
		ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("SELECT VERSION()");
		if (resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		
		return conn;
	}
	
	public Connection closeConn() throws SQLException {
		conn.close();
		return conn;
	}
	
	public void listarItem() throws SQLException {
		statement = conn.prepareStatement("select * from item");
		
		JOptionPane.showMessageDialog(null, getTabela(statement));
	}
	
	public void cadastrarItem() throws SQLException {
		local= JOptionPane.showInputDialog(null, "Local: ");
		data= JOptionPane.showInputDialog(null, "data: ");
		nome= JOptionPane.showInputDialog(null, "nome do item: ");
		obs= JOptionPane.showInputDialog(null, "Observação: ");
		tipo= JOptionPane.showInputDialog(null, "tipo: [achado / perdido]");

        statement = conn.prepareStatement("INSERT INTO item" +
                "  (local_item, data_item, nome, obs, tipo) VALUES " +
                " (?, ?, ?, ?, ?);"); 

        statement.setString(1, local);
        statement.setString(2, data);
        statement.setString(3, nome);
        statement.setString(4, obs);
        statement.setString(5, tipo);
   
		statement.executeUpdate();
    }

	public void excluirItem() throws SQLException {

		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Id excluir? "));
	
		statement = conn.prepareStatement("select * from item where id_item = ?");
		statement.setInt(1, id);
		JOptionPane.showMessageDialog(null, getTabela(statement));
		
		int r = Integer.parseInt(JOptionPane.showInputDialog(null, "CERTEZA que quer EXLUIR? [1]SIM [2]NÃO"));
		if(r==1) {
			statement = conn.prepareStatement( "delete from item where id_item = ?;");
			statement.setInt(1, id);
			statement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Id EXLUIDO: "+ id);
		}else {
			JOptionPane.showMessageDialog(null, "Item NÃO excluido");
		}
	}
		 
	public void alterarItem(int key) throws SQLException {
		
		String coluna="", alterar="";
		switch (key) { //Escolhendo a coluna a ser alterada
			case 1: {
				;
				coluna = "id_item";
				break;
			}
			case 2: {
				coluna = "local_item";
				break;
			}
			case 3: {
				coluna = "data_item";
				break;
			}
			case 4: {
				coluna = "nome";
				break;
			}
			case 5: {
				coluna = "obs";
				break;
			}
			case 6: {
				coluna = "tipo";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
		}
	
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id de quem voce deseja alterar: "));	
	
		//Mostrando item a ser alterado
		statement = conn.prepareStatement("select * from item where id_item = ?");
		statement.setInt(1, id);
		JOptionPane.showMessageDialog(null, "Item a ser alterado: \n"+getTabela(statement));
		
		int r = Integer.parseInt(JOptionPane.showInputDialog(null, "CERTEZA que quer ALTERAR? [1]SIM [2]NÃO"));
		
		if(r==1) {
			alterar = JOptionPane.showInputDialog(null, "Aualizar para: ");
	
			statement = conn.prepareStatement("update item set "+ coluna +" = ? where id_item = ?");
	   
			if(key==1) { //Se for o id
				statement.setInt(1, Integer.parseInt(alterar));
				statement.setInt(2, id);
				statement.executeUpdate();
				id = Integer.parseInt(alterar);
			}else { 
				statement.setString(1, alterar);
				statement.setInt(2, id);
				statement.executeUpdate();	
			}
			
			statement = conn.prepareStatement("select * from item where id_item = ?");
			statement.setInt(1, id);
			
			JOptionPane.showMessageDialog(null, "Item alterado: \n"+getTabela(statement));
		}else {
			JOptionPane.showMessageDialog(null, "Item NÃO alterado");
		}
	}

	public void procurarItemPorNome() throws SQLException {
		nome = JOptionPane.showInputDialog(null, "Digite o nome do objeto: ");
		
		statement = conn.prepareStatement("select * from item WHERE nome LIKE ?");
		statement.setString(1, "%"+ nome +"%");
		
		JOptionPane.showMessageDialog(null,getTabela(statement));
	}
	
	public String getTabela(PreparedStatement statement) throws SQLException { //Print da tabela
		ResultSet result= statement.executeQuery();
		tabela = "";
		while(result.next()) {
			int id = result.getInt("id_item");
			String local = result.getString("local_item");
			String data = result.getString("data_item");
			String nome = result.getString("nome");
			String obs = result.getString("obs");
			String tipo = result.getString("tipo");
			tabela += "\n"+ id +"  |  "+ local +"  |  "+ data +"  |  "+ nome +"  |  "+ obs +"  |  "+ tipo +"\n";
		}
		return tabela;
	}
	
	public void criartabela() throws SQLException {

	    statement = conn.prepareStatement("CREATE TABLE item\r\n"
	    		+ "(\r\n"
	    		+ "	id_item  		SERIAL,\r\n"
	    		+ "	local_item   VARCHAR(20),\r\n"
	    		+ "	data_item   VARCHAR(12),\r\n"
	    		+ "	nome VARCHAR(40),\r\n"
	    		+ "	obs    VARCHAR(40),\r\n"
	    		+ "	tipo VARCHAR(20),\r\n"
	    		+ "  PRIMARY KEY(id_item)\r\n"
	    		+ ");\r\n"
	    		+ "INSERT INTO item (local_item, data_item, nome, obs, tipo)\r\n"
	    		+ "	VALUES ('faculdade', '10/12/2000', 'relogio', 'Joao', 'perdido');	\r\n"
	    		+ "INSERT INTO item (local_item, data_item, nome, obs, tipo)\r\n"
	    		+ "	VALUES ('casa', '01/02/2013', 'mesa', 'Não sei', 'achado');\r\n"
	    		+ "INSERT INTO item (local_item, data_item, nome, obs, tipo)\r\n"
	    		+ "	VALUES ('laboratorio', '07/08/2010', 'GARRAFA', 'Marya', 'perdido');	\r\n"
	    		+ "INSERT INTO item (local_item, data_item, nome, obs, tipo)\r\n"
	    		+ "	VALUES ('laboratorio', '01/01/2022', 'PENDRIVE', 'Paulo', 'perdido');"); 
	
		 statement.executeUpdate();

    }	

//	private void printSQLException(SQLException ex) {
//        for (Throwable e: ex) {
//            if (e instanceof SQLException) {
//                e.printStackTrace(System.err);
//                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//                System.err.println("Message: " + e.getMessage());
//                Throwable t = ex.getCause();
//                while (t != null) {
//                    System.out.println("Cause: " + t);
//                    t = t.getCause();
//                }
//            }
//        }
//	}

}
