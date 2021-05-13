package ec.edu.ups.JDBCDAO;

import ec.edu.ups.Context.ContextJDBC;
import ec.edu.ups.daos.GenericDAO;

public abstract class JDBCGenericDAO<T, ID> implements GenericDAO<T, ID> {
	
	protected ContextJDBC jdbc = ContextJDBC.getJDBC();
	//protected Connection jdbc1 = ConexionBD.connect();
}
