package atividades.praticaFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MainTeste {
	private final static String url = "jdbc:postgresql://localhost/pratica06";
	private final static String user = "postgres";
	private final static String password = "pauloegol23";
	static Connection conn = null;

	public static void main(String[] args) {
		
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
			
			
    		int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id do item: "));
    		String status_achado = JOptionPane.showInputDialog(null, "Já acho o pedido? [S] ou [N]");
    		String nomeItem = JOptionPane.showInputDialog(null, "Digite o nome do item: ");
    		String local = JOptionPane.showInputDialog(null, "Digite o local que foi perdido: ");
    		String obs = JOptionPane.showInputDialog(null, "Alguma Oservação");
    		
	    	PreparedStatement statement2 = conn.prepareStatement(""+
	    			"INSERT INTO achados_perdidos (id_pessoa, nm_item, local_perdido, observacao, status_achado) "+
	    			"VALUES ("+id+  ", '"+nomeItem +"', '"+ local +"', '"+ obs +"', "+status_achado + ");");
	    	
	    	ResultSet rs = statement2.executeQuery();
	    	
		}catch (SQLException e) {
            printSQLException(e);
        }
	}
	
	private static void printSQLException(SQLException ex) {
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
