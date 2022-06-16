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
	String local, data, titulo, obs, tipo;
	
	public Connection connect() throws SQLException {
		try {
			
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
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	public Connection closeConn() throws SQLException {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
			
	public void cadastrarItem() {
    	try {
    		local= JOptionPane.showInputDialog(null, "Local: ");
    		data= JOptionPane.showInputDialog(null, "data: ");
    		titulo= JOptionPane.showInputDialog(null, "nome do item: ");
    		obs= JOptionPane.showInputDialog(null, "Observação: ");
    		tipo= JOptionPane.showInputDialog(null, "tipo: [achado / perdido]");
    		
            statement = conn.prepareStatement("INSERT INTO item" +
                    "  (local_item, data_item, nome, obs, tipo) VALUES " +
                    " (?, ?, ?, ?, ?);"); 
            
            statement.setString(1, local);
            statement.setString(2, data);
            statement.setString(3, titulo);
            statement.setString(4, obs);
            statement.setString(5, tipo);

    		statement.executeUpdate();
    		
		}catch (SQLException e) {
            printSQLException(e);
        }
    }

	public void alterarItem(int key) {
		
		String coluna="", alterar="";
		switch (key) {
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
				coluna = "observacao";
				break;
			}
			case 6: {
				coluna = "tipo";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
		//Escolhendo a linha a ser alterada
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id de quem voce deseja alterar: "));	
		
		try {
			printLinha("Coluna a ser alterada: ", id); //Mostrando linha
			
			alterar = JOptionPane.showInputDialog(null, "Aualizar para: ");

    		// Criando o statement (varivel responsavel por executar as instru��es)
    		statement = conn.prepareStatement("update item set "+ coluna +" = ? where id_item = ?");
    		
    		
    		//Vai receber o resultado da query
    		if(key==1) {
    			statement.setInt(1, Integer.parseInt(alterar));
    		}else {
    			statement.setString(1, alterar);
    		}
    		statement.setInt(2, id);
    		
            //Processando
    		 statement.executeUpdate();

     		printLinha("Nova linha: ", id); //Mostrando linha
		}catch (SQLException e) {
            printSQLException(e);
        }
	}

	public void excluirItem() {
    	try {
    		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Id excluir? "));
    		
    		printLinha("CERTEZA QUE DESEJA EXCLUIR!!!!!!!!!!:  ", id); //Mostrando linha
    		
    		int r = Integer.parseInt(JOptionPane.showInputDialog(null, "CERTEZA? [1]SIM [2]NÃO"));
    		if(r==1) {
	    		// Criando o statement (varivel responsavel por executar as instruçoes)
	    		statement = conn.prepareStatement( "delete from item where id_item = ?;");
	    		
	    		//Vai receber o resultado da query
	    		statement.setInt(1, id);
	            
	            //Processandos
	    		statement.executeUpdate();
	    		JOptionPane.showMessageDialog(null, "ITEM EXLUIDO: "+ id);
    		}
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
		 
	public void listarItem() {
    	try {
    		// Criando o statement (varivel responsavel por executar as instru��es)
    		statement = conn.prepareStatement("select * from item");
    		
    		//Vai receber o resultado da query
    		ResultSet result= statement.executeQuery();
    		
    		//mostrando tabela
    		printTabela(result);
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void procurarItemPorNome() {
    	try {
    		// Criando o statement (varivel responsavel por executar as instru��es)
   		statement = conn.prepareStatement("select * from item where nome like ?");

    		
   // 		statement = conn.prepareStatement("select * from item where nome = ?");
    		
	    	String titulo = JOptionPane.showInputDialog(null, "Digite o nome do objeto: ");
    		//Vai receber o resultado da query
    		
//	    	statement.setString(1, titulo);
    		statement.setString(1, "'%"+ titulo +"%'");
	    	
            //Processando
			ResultSet result= statement.executeQuery();
			String tabela = "";
			while(result.next()) {
				int id_item = result.getInt("id_item");
				String local = result.getString("local_item");
				String data = result.getString("data_item");
				String nome = result.getString("nome");
				String obs = result.getString("obs");
				String tipo = result.getString("tipo");
				tabela += "\n"+ id_item +" / "+ local +" / "+ data +" / "+ nome +" / "+ obs +" / "+ tipo;
			}
			JOptionPane.showMessageDialog(null, tabela);
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void printLinha(String msg, int id) {
		try {	
			statement = conn.prepareStatement("select * from item where id_item = ?");
			statement.setInt(1, id);
			ResultSet result= statement.executeQuery();
	        String tabela = "";
    		while(result.next()) {
    			int id_item = result.getInt("id_item");
    			String local = result.getString("local_item");
    			String data = result.getString("data_item");
    			String nome = result.getString("nome");
    			String obs = result.getString("obs");
    			String tipo = result.getString("tipo");
    			tabela += "\n"+ id_item +" / "+ local +" / "+ data +" / "+ nome +" / "+ obs +" / "+ tipo +"\n";
    		}

    		JOptionPane.showMessageDialog(null, tabela);
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void printTabela(ResultSet result) {
    	try {
			String tabela = "#######################################################################################";
	    	while(result.next()) {
				int id = result.getInt("id_item");
				String local = result.getString("local_item");
				String data = result.getString("data_item");
				String nome = result.getString("nome");
				String obs = result.getString("obs");
				String tipo = result.getString("tipo");
				tabela += "\n"+ id +"  |  "+ local +"  |  "+ data +"  |  "+ nome +"  |  "+ obs +"  |  "+ tipo +"\n";
	    	}
	    	tabela += "#######################################################################################";
	    	JOptionPane.showMessageDialog(null, tabela);
		}catch (SQLException e) {
            printSQLException(e);
        }
	}

	private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
	}
	
	public void criartabela() {
    	try {
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
		}catch (SQLException e) {
            printSQLException(e);
        }
    }
	
	
}
