package ec.edu.ups.JDBCDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ec.edu.ups.clases.Usuario;
import ec.edu.ups.daos.UsuarioDAO;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public void createTable() {
		jdbc.update("DROP TABLE IF EXISTS Usuario");
		jdbc.update("CREATE TABLE usuario (" + "usu_cedula String NOT NULL," + "usu_nombe varchar(45) DEFAULT NULL,"
				+ "usu_apellido varchar(45) DEFAULT NULL" + "usu_correo varchar(45) DEFAULT NULL"
				+ "usu_contrasena varchar(45)" + "PRIMARY KEY (cedula))");
	}

	public void create(Usuario entity) {
		jdbc.update("INSERT INTO Usuarios (usu_cedula, usu_nombre, usu_apellido, usu_correo, usu_contrasena) "
				+ "VALUES ('" + entity.getCedula() + "','" + entity.getNombre() + "','" + entity.getApellido() + "','"
				+ entity.getCorreo() + "','" + entity.getContrasenia() + "');");
	}

//metodos
	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario read(String correo) throws SQLException {
		Usuario x = new Usuario();
		String ci = "";
		String nam = "";
		String ape = "";
		String query = "SELECT * FROM Usuarios where usu_correo = '" + correo + "';";
		ResultSet rs = jdbc.query(query);
		while (rs.next()) {
			ci = rs.getString(1);
			nam= rs.getString(2);
			ape = rs.getString(3);
		}
		x.setCedula(ci);
		x.setNombre(nam);
		x.setApellido(ape);
		
		return x;
	}

	public boolean comprobar(String correo, String password) throws SQLException {
		String query = "SELECT * FROM Usuarios where usu_correo = '" + correo + "' and usu_contrasena = '" + password
				+ "';";
		ResultSet rs = jdbc.query(query);
		System.out.println(query);
		boolean band = false;
		while (rs.next()) {
			band = true;
		}

		return band;
	}

	public void update(Usuario entity) {
		// TODO Auto-generated method stub

	}

	public void delete(Usuario entity) {
		// TODO Auto-generated method stub

	}

	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
