

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		System.out.println("---------------");
		System.out.println(getServletContext());
		System.out.println("Init method is called " +this.getClass().getName());
		System.out.println("---------------");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		doGet((HttpServletRequest)arg0,(HttpServletResponse)arg1);
	}
	public void destroy() {
		System.out.println("---------------");
		System.out.println("Destroy method is called " +this.getClass().getName());
		System.out.println("---------------");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Login doGet()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		out.println("Welcome" +userName);
		HttpSession session = request.getSession();
		session.setAttribute("uname", userName);
		ServletContext ctx =getServletContext();
		System.out.println(ctx.getAttribute("totalusers"));
		System.out.println(ctx.getAttribute("currentusers"));
		int totalUsers = (Integer)ctx.getAttribute("totalusers");
		int currentUsers = (Integer)ctx.getAttribute("currentusers");
		out.println("<br>total users" +totalUsers);
		out.println("<br>current users" +currentUsers);
		out.println("<br><a href = 'logout'>logout</a>");
		out.close();
		
	}

}
