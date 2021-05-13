package ec.edu.ups.JDBCDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import ec.edu.ups.clases.Telefono;
import ec.edu.ups.daos.TelefonoDAO;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	public void createTable() {
		// TODO Auto-generated method stub

	}

	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Telefono entity) {
		// TODO Auto-generated method stub

	}

	public void delete(Telefono entity) {
		// TODO Auto-generated method stub

	}

	public void create(Telefono entity) {
		// TODO Auto-generated method stub

	}

	public LinkedList<Telefono> listar(String ced) throws NumberFormatException, SQLException {
		ResultSet rs = jdbc.query("SELECT * FROM telefonos WHERE usu_cedula_tel = '"+ced+"';");
		LinkedList<Telefono> lista = new LinkedList<Telefono>();
		while(rs.next()) {
			Telefono t = new Telefono();
		
			t.setCodigo(rs.getInt(1));
			t.setNumero(rs.getString(2));
			t.setOperadora(rs.getString(3));
			t.setTipo(rs.getString(4));
			lista.add(t);
		}
		return lista;		
	}

	public void createTel(Telefono t, String cedula) throws SQLException {
		ResultSet r = jdbc.query("select count(*) from telefonos;");
		r.next();
		int cod = r.getInt(1);
		
		jdbc.update("INSERT INTO telefonos "  + "(tel_codigo, tel_numero,tel_tipo, tel_operadora, usu_cedula_tel)"
				+ " VALUES ('" + cod + " ','" + t.getNumero() + "','" + t.getTipo() + "','"
				+ t.getOperadora() + "','" + cedula + "') ");
	}

	public List<Telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
