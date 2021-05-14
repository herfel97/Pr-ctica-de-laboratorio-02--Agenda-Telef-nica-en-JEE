package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import ec.edu.ups.JDBCDAO.JDBCTelefonoDAO;
import ec.edu.ups.clases.Telefono;

/**
 * Servlet implementation class ServletBuscarContacto
 */
@WebServlet("/ServletBuscarContacto")
public class ServletBuscarContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletBuscarContacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = (HttpSession) request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		session.setAttribute("listaTelefonos", null);
		String val = request.getParameter("valor");
		String op = request.getParameter("opcion");
		out.println("busqueda");
		JDBCTelefonoDAO t = new JDBCTelefonoDAO();
		LinkedList<Telefono> telefonos = null;
		
		if(op.equals("correo")) {
			try {
				telefonos = t.listarPorCorreo(val);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(op.equals("cedula")){
			try {
				telefonos = t.listar(val);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			out.println("no hay resultados");
		}
		
		
		session.setAttribute("listaTel", telefonos);
		response.sendRedirect("resultados.jsp");
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
