package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.JDBCDAO.JDBCUsuarioDAO;
import ec.edu.ups.clases.Usuario;

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
	 *      
	 *      
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String ci = request.getParameter("cedula");
		String nam = request.getParameter("nombre").toUpperCase();
		String ap = request.getParameter("apellido").toUpperCase();
		String corr = request.getParameter("correo").toLowerCase();
		String clav = request.getParameter("clave");
		Usuario user = new Usuario();
		user.setCedula(ci);
		user.setNombre(nam);
		user.setApellido(ap);
		user.setCorreo(corr);
		user.setContrasenia(clav);
	
		System.out.println("Registro: " + ci + " " + nam + " " + ap + " " + corr + "  " + clav);
		JDBCUsuarioDAO f = new JDBCUsuarioDAO();
		f.create(user);

		out.println("<h9>!! Usuario creado exitosamente !! </h9>");
		RequestDispatcher rd = request.getRequestDispatcher("registro.html");
		rd.include(request, response);
		out.close();

	}

}
