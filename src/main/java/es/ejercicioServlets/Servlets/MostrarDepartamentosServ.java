package es.ejercicioServlets.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.Transaction;

import es.departamentos.DAO.*;

/**
 * Servlet implementation class MostrarDepartamentosServ
 */
@WebServlet(name = "MostrarDepartamentos", urlPatterns = { "/MostrarDepartamentos" })
public class MostrarDepartamentosServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDepartamentosServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try {
			List<Departamento> providers = ClientDAO.getAllClients();
			PrintWriter salida=response.getWriter();
			salida.println("<html><body>");
			salida.println("<h1 style='text-align:center'>Mostrar datos</h1>");
			salida.println("");
			salida.println("");
			salida.println("");
			salida.println("Fecha y hora actual"+ providers.toString());
			salida.println("</body></html>");
			
		}catch (Exception e) {
			
		}
		//List<Departamento> providers = ClientDAO.getAllClients(session);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
