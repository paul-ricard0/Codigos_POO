package atividades.pratica06.ex01;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectarPostgre {
	
	private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria"; // O QUE DEVO FAZER AQUI MICHELLE?
	private final String user = "postgres";// O QUE DEVO FAZER AQUI MICHELLE?
	private final String password = "pauloegol14";
	Connection conn = null;
	
	
	public Connection connect() {
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			if (conn != null) {
				System.out.println("Connected to the PostgreSQL server successfully.");
			} else {
				System.out.println("Failed to make connection!");
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
}
