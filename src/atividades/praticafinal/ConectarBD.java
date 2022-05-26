package atividades.praticafinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarBD {
	
	private final String url = "";
	private final String user = "";
	private final String password = "";
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
}
