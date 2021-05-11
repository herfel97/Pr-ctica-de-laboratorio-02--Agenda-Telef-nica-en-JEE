package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.utilities.ConexionBD;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRegistro() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = (HttpSession) request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String ci = request.getParameter("cedula");
		String nam = request.getParameter("nombre").toUpperCase();
		String ap = request.getParameter("apellido").toUpperCase();
		String corr = request.getParameter("correo").toLowerCase();
		String clav = request.getParameter("clave");

		System.out.println("Registro: " + ci + " " + nam + " " + ap + " " + corr + "  " + clav);
		ConexionBD conn = new ConexionBD();

		try {
			Statement st = conn.connect().createStatement();
			String sent = "INSERT INTO Usuarios " + "(usu_cedula,usu_nombre, usu_apellido, usu_correo, usu_contrasena) "
					+ "VALUES('" + ci + "','" + nam + "','" + ap + "','" + corr + "','" + clav + "')";
			System.out.println(sent);
					st.execute(sent);
			
		} catch (SQLException e) {
			System.out.println("error al insertar");
		}

		out.println("<h9>!! Usuario creado exitosamente !! </h9>");
		RequestDispatcher rd = request.getRequestDispatcher("registro.html");
		rd.include(request, response);
		out.close();

	}

}
