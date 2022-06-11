package atividades.pratica06.ex01;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GerenciadorBD {
	
	private final String url = "jdbc:postgresql://localhost/pratica06"; // NOME DO BD
	private final String user = "postgres";// NOME DO USER
	private final String password = "123456"; // SENHA
	Connection conn = null;
	
	
	public Connection connect() {
		
		try {
			conn = DriverManager.getConnection(url, user, password); // Conectando no banco de dados
			
			if (conn != null) {
				System.out.println("Connected to the PostgreSQL server successfully."); 
			} else {
				System.out.println("Failed to make connection!");
			}
			
			//vers�o do postgreeSQL
			Statement statement = (Statement) conn.createStatement();
			ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("SELECT VERSION()");
			
			if (resultSet.next()) {
				System.out.println(resultSet.getString(1)+"\n");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
    public void getAllLivros() {
    	try {
    		// Criando o statement (varivel responsavel por executar as instru��es)
    		PreparedStatement statementLivro = conn.prepareStatement("select * from livro");
    		
    		//Vai receber o resultado da query
    		ResultSet resultado = statementLivro.executeQuery();
    		
            //Processando
    		System.out.println("\n \n=============================================================================================================");
    		System.out.println("Categoria  Data \tvl_preco \t Nome");
    		while(resultado.next()) {
    			int id = resultado.getInt("id_categoria");
    			String name = resultado.getString("nm_titulo");
    			String data = ""+resultado.getDate("dt_publicacao");
    			String vl_preco = ""+resultado.getString("vl_preco");
    			System.out.println(id +" \t "+ data +" \t "+ vl_preco +"\t    "+ name);
    		}
		}catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    public void getCliente(){
    	try {
	    	PreparedStatement statement = conn.prepareStatement("select * from cliente where id_cliente = ?");
	    	
	    	int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id do Cliente: "));
	    	statement.setInt(1, id);
	    	
	    	ResultSet rs = statement.executeQuery();
	    	System.out.println("\n\n=============================================================================================================");
	    	System.out.println("id_cliente  sg_sexo_cliente  sg_uf_cliente  Nome");
	        while (rs.next()) { 
	            int id_cliente = rs.getInt("id_cliente");
	            String sexo = rs.getString("sg_sexo_cliente");
	            String estado = rs.getString("sg_uf_cliente");
	            String name_cliente = rs.getString("nm_cliente"); 
	            System.out.println(id_cliente +" \t \t"+  sexo +" \t \t "+ estado +" \t "+name_cliente); 
    		}
		}catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    public void getPedidosCliente(){
    	try {
	    	PreparedStatement statement = conn.prepareStatement("select * from pedido where id_cliente = ?");
	    	
	    	int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id do Cliente: "));
	    	statement.setInt(1, id);
	    	
	    	ResultSet rs = statement.executeQuery();
	    	System.out.println("\n \n=============================================================================================================");
	    	System.out.println("id_cliente \t id_func \t id_pedido \t data \t \t vl_total_pago");
	        while (rs.next()){
	            int id_cliente = rs.getInt("id_cliente");
	            String id_func = rs.getString("id_funcionario"); 
	            String id_pedido= rs.getString("id_pedido"); 
	            String data = ""+rs.getDate("dt_pedido");
	            String vl_total_pago = ""+rs.getString("vl_total_pago");
	            
	            System.out.println("\t" +id_cliente +" \t "+ id_func +" \t \t"+ id_pedido +" \t \t"+ data +" \t \t "+ vl_total_pago ); 
    		}
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
