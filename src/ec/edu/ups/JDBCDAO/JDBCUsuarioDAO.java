package ec.edu.ups.JDBCDAO;

import java.util.List;

import ec.edu.ups.clases.Usuario;
import ec.edu.ups.daos.UsuarioDAO;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public void createTable() {
		jdbc.update("DROP TABLE IF EXISTS Usuario");
		jdbc.update("CREATE TABLE usuario ("+"usu_cedula String NOT NULL,"+"usu_nombe varchar(45) DEFAULT NULL,"+
				"usu_apellido varchar(45) DEFAULT NULL"+
				"usu_correo varchar(45) DEFAULT NULL"+
				"usu_contrasena varchar(45)"+"PRIMARY KEY (cedula))");
	}
 @Override public void create(Usuario entity) {
	 jdbc.update("INSERT Usuario VALUES ("+ ) 
	}

	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
