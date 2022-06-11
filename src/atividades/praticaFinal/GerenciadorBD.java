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
	private final String password = "pauloegol23";
	Connection conn = null;
	
	public Connection connect() throws SQLException {
		
		
		try {
			
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null){
				System.out.println("Conex�o ao Banco de dados feita com sucesso");
			}else {
				System.out.println("Conex�o ao Banco de dados falho!!!!");
			}
			
			//vers�o do postgreeSQL
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
	
	

    
    public void insertPessoa(){
    	try {
    		
    		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id do item: "));
    		String status_achado = JOptionPane.showInputDialog(null, "J� acho o pedido? [S] ou [N]");
    		String nomeItem = JOptionPane.showInputDialog(null, "Digite o nome do item: ");
    		String local = JOptionPane.showInputDialog(null, "Digite o local que foi perdido: ");
    		String obs = JOptionPane.showInputDialog(null, "Alguma Oserva��o");
    		
	    	PreparedStatement statement = conn.prepareStatement(""+
	    			"INSERT INTO achados_perdidos (id_pessoa, nm_item, local_perdido, observacao, status_achado) "+
	    			"VALUES ("+id+  ", '"+nomeItem +"', '"+ local +"', '"+ obs +"', "+status_achado + ");");
	    	
	    	ResultSet rs = statement.executeQuery();
	    	
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
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
