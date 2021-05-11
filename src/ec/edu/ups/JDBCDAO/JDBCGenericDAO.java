package ec.edu.ups.JDBCDAO;

import java.sql.Connection;
import ec.edu.ups.Context.ContextJDBC;
import ec.edu.ups.daos.GenericDAO;
import ec.edu.ups.utilities.ConexionBD;

public abstract class JDBCGenericDAO<T, ID> implements GenericDAO<T, ID> {
	
	protected ContextJDBC jdbc = ContextJDBC.getJDBC();
	//protected Connection jdbc1 = ConexionBD.connect();
}
