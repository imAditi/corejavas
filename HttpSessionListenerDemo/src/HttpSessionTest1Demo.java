

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionTest1Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		System.out.println("---------------");
		System.out.println("Init method is called " +this.getClass().getName());
		System.out.println("---------------");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		sleep();
		HttpSession httpSession = request.getSession();
		sleep();
		httpSession.invalidate();
	}
	private void sleep() {
		try {
			Thread.sleep(12000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
