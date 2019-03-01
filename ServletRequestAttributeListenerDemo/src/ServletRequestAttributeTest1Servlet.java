

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestAttributeTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		System.out.println("-------------------------");
		System.out.println("Init method is called in" +this.getClass().getName());;
		System.out.println("-------------------------");
	}
	public void destroy() {
		System.out.println("-------------------------");
		System.out.println("Destroy method is called in" +this.getClass().getName());;
		System.out.println("-------------------------");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		sleep();
		request.setAttribute("CompanyName", "Wipro");
		sleep();
		request.setAttribute("CompanyName", "Infosys");
		sleep();
		request.removeAttribute("CompanyName");
		
	}
	private void sleep() {
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
			ex.printStackTrace();
		}
		
	}

}
