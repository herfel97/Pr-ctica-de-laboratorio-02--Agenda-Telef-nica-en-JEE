package ec.edu.ups.vistas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMain
 */
@WebServlet("/ServletMain")
public class ServletMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMain() {
        super();
        // TODO Auto-generated constructor stub
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
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("usuario");  
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Login</title>");
	    out.println("<link rel=\"stylesheet\"\r\n"
	    		+ "	    	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n"
	    		+ "	    	integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n"
	    		+ "	    	crossorigin=\"anonymous\">");
	    out.println("<link rel=\"stylesheet\"\r\n"
	    		+ "	    	href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\"\r\n"
	    		+ "	    	integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\r\n"
	    		+ "	    	crossorigin=\"anonymous\">");
	    out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">");
	    out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estiloCalculadora.css\">");
	    out.println("</head>");
	    out.println("<h8> Bienvenido: "+n+"</h8>");  
	    out.println("<br>");
	    out.println("<a href=logout> Cerrar Sesion </a>");    
	    out.close();  
		
	}

}
