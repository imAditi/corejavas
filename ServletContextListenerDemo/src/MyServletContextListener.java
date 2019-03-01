import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("\n##############\n");
		System.out.println("contextInitialised method is called in" +this.getClass().getName());
		ServletContext servletContext = servletContextEvent.getServletContext();
		System.out.println(servletContext + "is initialised or created");
		System.out.println("\n##############\n");
	}
		
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("\n##############\n");
		System.out.println("contextDestroyed method is called in" +this.getClass().getName());
		ServletContext servletContext = servletContextEvent.getServletContext();
		System.out.println(servletContext + "is initialised or created");
		System.out.println("\n##############\n");
		}
}
