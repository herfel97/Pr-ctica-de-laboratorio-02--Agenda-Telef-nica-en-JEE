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

import ec.edu.ups.JDBCDAO.JDBCTelefonoDAO;
import ec.edu.ups.clases.Telefono;

/**
 * Servlet implementation class ServRegistroContactos
 */
@WebServlet("/ServRegistroContactos")
public class ServRegistroContactos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServRegistroContactos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = (HttpSession) request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String num = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String opr = request.getParameter("operador");
		
		Telefono tel = new Telefono();
		tel.setNumero(num);
		tel.setTipo(tipo);
		tel.setOperadora(opr);
		String cedu =(String) session.getAttribute("cedula"); 
		
		JDBCTelefonoDAO t = new JDBCTelefonoDAO();
		try {
			t.createTel(tel, cedu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("registrarTelefono.jsp");
		out.println("alert('Telefono agregado a la BD')");
		rd.include(request, response);
		out.close();	
	}

}
