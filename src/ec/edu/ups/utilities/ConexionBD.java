package ec.edu.ups.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {

	public static Connection connect() {
		try {
			Class.forName("org.postgresql.Driver");
			
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:postgresql://localhost/jee";
		String user = "postgres";
		String password = "802258";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

}