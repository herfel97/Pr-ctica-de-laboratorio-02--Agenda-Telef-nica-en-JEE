package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.JDBCDAO.JDBCUsuarioDAO;
import ec.edu.ups.clases.Usuario;

/**
 * Servlet implementation class ServletLogin
 */

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = (HttpSession)request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("usuario");
		String p = request.getParameter("clave");
		JDBCUsuarioDAO d = new JDBCUsuarioDAO();
		
		boolean band =false;
		try {
			band = d.comprobar(n,p);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Usuario x = null;
		if(band == true) {
			try {
				x = d.read(n);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			session.setAttribute("usuario",x.getNombre());
			session.setAttribute("cedula",x.getCedula());
			rd.forward(request, response);
		}else {
			out.println ("<h9>!! Usuario invalido !! </h9>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		out.close();	
	}

}
