package atividades.pratica06.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarBD {
	

	 ConectarBD connBD = new ConectarBD();
	 Connection conn = connBD.getConn();
	 
	 	
	    public void getUserById() {
	        try {
	            // Criando o statement (varivel responsavel por executar as instruções)
	            PreparedStatement statementId_Autor = conn.prepareStatement("select * from autor where id_autor = ?");
	            
	            
	            statementId_Autor.setInt(1, 5); // 1 é a quantidade de ?   5 é o valor que vai ser inserido
	            
	            System.out.println(statementId_Autor);
	            
	            //Vai receber o resultado da query
	            ResultSet rs = statementId_Autor.executeQuery();
	            
	            //Processando
	            while (rs.next()) { //next comandinho que roda até o fim da tabela
	            	
	                int id = rs.getInt("id_autor"); //passando o id para variavel
	                String name_autor = rs.getString("nm_autor"); //passando o autor para variavel
	                
	                System.out.println(id + " - " + name_autor); 
	                
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }
	    
	    public void getAllUsers() {
	
	        try {

	            PreparedStatement statementAutor = conn.prepareStatement("select * from autor");
	            System.out.println(statementAutor); //Pq isso??
	      
	            ResultSet rs = statementAutor.executeQuery();


	            while (rs.next()) {
	                int id = rs.getInt("id_autor");
	                String name_autor = rs.getString("nm_autor");
	                System.out.println(id + " - " + name_autor);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }
	    
	    
	    
	    public void getAllLivros() {
	    	try {
				
	    		PreparedStatement statementLivro = conn.prepareStatement("select * from livros");
	    		
	    		ResultSet resultado = statementLivro.executeQuery();
	    		
	    		while(resultado.next()) {
	    			int id = resultado.getInt("id_categoria");
	    			String name = resultado.getString("nm_titulo");
	    			String data = ""+resultado.getDate("dt_publicacao");
	    			
	    			System.out.println(id +" - "+ name +" - "+ data);
	    			
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
	    
	    
	    
	    /*************************************************
	 		procurar serviço e reiniciar o postgre
		**************************************************/
}
