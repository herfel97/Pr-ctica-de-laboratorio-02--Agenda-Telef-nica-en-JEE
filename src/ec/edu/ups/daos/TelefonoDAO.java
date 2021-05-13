package ec.edu.ups.daos;

import java.sql.SQLException;

import ec.edu.ups.clases.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {
	
	public void createTel(Telefono t, String cedula) throws SQLException;
}
