package atividades.praticaFinal;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectBD {
	
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
			
			//versão do postgreeSQL
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
}