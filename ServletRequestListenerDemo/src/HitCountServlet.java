

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void init() throws ServletException {
		System.out.println("-------------------------");
		System.out.println("Init method is called in" +this.getClass().getName());;
		System.out.println("-------------------------");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.print("<h2> This is target servlet </h2>");
		out.print("<h2> the no of hits for this application is " +MyServletRequestListener.count);
	}
	public void destroy() {
		System.out.println("-------------------------");
		System.out.println("Destroy method is called in" +this.getClass().getName());
		System.out.println("-------------------------");
	}

	
}
