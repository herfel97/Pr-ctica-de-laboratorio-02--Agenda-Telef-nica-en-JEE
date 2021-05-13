package ec.edu.ups.Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContextJDBC {
	private static final String DRIVER ="org.postgresql.Driver";
	private static final String URL ="jdbc:postgresql://localhost/jee";
	private static final String USER = "postgres";
	private static final String PASS= "hm123.";
	
	private static ContextJDBC jdbc = null;
	private java.sql.Statement statement = null;
	
	public ContextJDBC() {this.connect();} 
	public static ContextJDBC getJDBC() {
		if (jdbc == null) jdbc = new ContextJDBC();
		return jdbc;
	}
	
	private void connect(){
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			this.statement = connection.createStatement();
		}catch (ClassNotFoundException e) {
			System.out.println(">>>Warning (JDBC:connect)...problemas con el driver");}
		catch (SQLException e ) {System.out.println(">>>>WARNING (JDBC:connect)...problemas con la BD");}	
			
		}
	public ResultSet query(String sql) {
		try {return this.statement.executeQuery(sql);
		} catch(SQLException e) { System.out.println(">>>>WARNING (JDBC:query): ---"+sql+"---"+ e);}
		return null;
		
	}
	public boolean update(String sql) {
		try {this.statement.executeUpdate(sql); return true;
		}catch (SQLException e) {System.out.println(">>>>WARNING (JDBC:update)...actualizacion: ---"+sql+"---"+e);
			// TODO: handle exception
		}
		return false;
	}
	}

