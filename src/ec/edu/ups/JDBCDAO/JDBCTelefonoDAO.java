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

	public Telefono read(String id) {
		Telefono x = new Telefono();
		ResultSet rs = jdbc.query("SELECT * from telefonos WHERE tel_codigo = " + id);
		try {
			while (rs.next()) {
				x.setCodigo(rs.getInt(1));
				x.setNumero(rs.getString(2));
				x.setOperadora(rs.getString(3));
				x.setTipo(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return x;
	}

	public void update(Telefono t) {
		String que = "UPDATE telefonos " + "SET tel_numero = '" + t.getNumero() + "'," + "tel_operadora = '"
				+ t.getOperadora() + "'," + "tel_tipo = '" + t.getTipo() + "'" + " where tel_codigo = " + t.getCodigo()
				+ ";";
		jdbc.update(que);
		System.out.println("Telefono modificado");

	}

	public void delete(Telefono t) {
		jdbc.query("DELETE FROM telefonos WHERE tel_codigo= " + t.getCodigo());

	}

	public void create(Telefono entity) {
		// TODO Auto-generated method stub

	}

	public LinkedList<Telefono> listar(String ced) throws NumberFormatException, SQLException {
		String query = "SELECT * FROM telefonos WHERE usu_cedula_tel = '" + ced + "';";
		ResultSet rs = jdbc.query(query);
		LinkedList<Telefono> lista = new LinkedList<Telefono>();
		while (rs.next()) {
			Telefono t = new Telefono();
			t.setCodigo(rs.getInt(1));
			t.setNumero(rs.getString(2));
			t.setOperadora(rs.getString(3));
			t.setTipo(rs.getString(4));
			lista.add(t);
		}
		return lista;
	}

	public LinkedList<Telefono> listarPorCorreo(String corr) throws NumberFormatException, SQLException {
		String query = "SELECT tel.tel_codigo, tel.tel_numero, tel.tel_operadora, tel.tel_tipo "
				+"from telefonos tel , usuarios u " 
				+" WHERE u.usu_correo ='"+corr+"' and tel.usu_cedula_tel = u.usu_cedula;";
		
		ResultSet rs = jdbc.query(query);
		LinkedList<Telefono> lista = new LinkedList<Telefono>();
		while(rs.next()) {
			Telefono t = new Telefono();
		
			t.setCodigo(rs.getInt(1));
			t.setNumero(rs.getString(2));
			t.setOperadora(rs.getString(3));
			t.setTipo(rs.getString(4));
			lista.add(t);
		}
		System.out.println(query);
		return lista;		
	}

	public void createTel(Telefono t, String cedula) throws SQLException {
		ResultSet r = jdbc.query("select count(*) from telefonos;");
		r.next();
		int cod = r.getInt(1);

		jdbc.update("INSERT INTO telefonos " + "(tel_codigo, tel_numero,tel_tipo, tel_operadora, usu_cedula_tel)"
				+ " VALUES ('" + cod + " ','" + t.getNumero() + "','" + t.getTipo() + "','" + t.getOperadora() + "','"
				+ cedula + "') ");
	}

	public List<Telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}

	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
