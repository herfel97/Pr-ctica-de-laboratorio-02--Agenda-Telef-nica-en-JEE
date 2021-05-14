package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.JDBCDAO.JDBCTelefonoDAO;
import ec.edu.ups.clases.Telefono;

/**
 * Servlet implementation class ServActualizar
 */
@WebServlet("/ServActualizar")
public class ServActualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServActualizar() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int cod = Integer.valueOf(request.getParameter("codigo"));
	  
		String num = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String opr = request.getParameter("operador");
		
		Telefono tel = new Telefono();
		tel.setCodigo(cod);
		tel.setNumero(num);
		tel.setTipo(tipo);
		tel.setOperadora(opr);
		
		JDBCTelefonoDAO t = new JDBCTelefonoDAO();
		t.update(tel);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarTelefonos.jsp");
		rd.include(request, response);
		out.close();	
	}

}
