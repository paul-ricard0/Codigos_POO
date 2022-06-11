package atividades.praticaFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GerenciadorBD {
	
	private final String url = "jdbc:postgresql://localhost/pratica06";
	private final String user = "postgres";
	private final String password = "123456";
	Connection conn = null;
	
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
	
	public void cadastrarItem() {
    	try {
    		// Criando o statement (varivel responsavel por executar as instruções)
    		PreparedStatement statement = conn.prepareStatement("INSERT INTO users" +
			        "  (id, local, data, titulo, observacao, tipo) VALUES " +
			        " (?, ?, ?, ?, ?, ?);");
    
    		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id: "));
    		String local= JOptionPane.showInputDialog(null, "Local: ");
    		String data= JOptionPane.showInputDialog(null, "data: ");
    		String titulo= JOptionPane.showInputDialog(null, "titulo: ");
    		String obs= JOptionPane.showInputDialog(null, "Observação: ");
    		String tipo= JOptionPane.showInputDialog(null, "tipo: ");
    		
    		//Vai receber o resultado da query
    		 statement.setInt(1, id);
    		 statement.setString(2, local);
    		 statement.setString(3, data);
    		 statement.setString(4, titulo);
    		 statement.setString(5, obs);
    		 statement.setString(6, tipo);
    		
            //Processando
    		 statement.executeUpdate();
		}catch (SQLException e) {
            printSQLException(e);
        }
    }
    
	public void alterarItem(int key) {
		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id de quem você deseja alterar: "));
		
		String coluna="", alterar="";
		switch (key) {
		case 1: {
			;
			coluna = "id";
			break;
		}
		case 2: {
			coluna = "local";
			break;
		}
		case 3: {
			coluna = "data";
			break;
		}
		case 4: {
			coluna = "titulo";
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
				
    	try {
    		// Criando o statement (varivel responsavel por executar as instruções)
    		PreparedStatement statement = conn.prepareStatement("update users set "+ coluna +" = ? where id = ?");
    		alterar = JOptionPane.showInputDialog(null, "Aualizar para: ");
    		
    		
    		//Vai receber o resultado da query
    		if(key==1) {
    			statement.setInt(1, Integer.parseInt(alterar));
    		}else {
    			statement.setString(1, alterar);
    		}
    		statement.setInt(2, id);
    		
    		
            //Processando
    		 statement.executeUpdate();
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void excluirItem() {

    	try {
    		// Criando o statement (varivel responsavel por executar as instruções)
    		PreparedStatement statement = conn.prepareStatement( "delete from users where id = ?;");
    		
    		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Id excluir? "));
    		
    		//Vai receber o resultado da query
    		statement.setInt(1, id);
            
    		
            //Processando
    		 int r = statement.executeUpdate();
             System.out.println("Número de registros afetados : " + r);
             
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void listarItem() {

    	try {
    		// Criando o statement (varivel responsavel por executar as instruções)
    		PreparedStatement statement = conn.prepareStatement( "");
    		
    		
    		
    		//Vai receber o resultado da query
    		
            
    		
            //Processando
    		 int r = statement.executeUpdate();
             
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	public void procurarItemPorTitulo() {

    	try {
    		// Criando o statement (varivel responsavel por executar as instruções)
    		PreparedStatement statement = conn.prepareStatement( "");
    		
    		
    		
    		//Vai receber o resultado da query
    		
            
    		
            //Processando
    		 int r = statement.executeUpdate();
             
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
    // PRINT DAS EXCEPTION
    public static void printSQLException(SQLException ex) {
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
}
