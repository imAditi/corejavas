import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{
	public static int count = 0;
	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		count++;
		System.out.println("\n##############\n");
		System.out.println("requestInitialised method is called in" +this.getClass().getName());
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		System.out.println(servletRequest + "is created or initialised : ");
		System.out.println("\n##############\n");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		System.out.println("\n##############\n");
		System.out.println("requestDestroyed method is called in" +this.getClass().getName());
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		System.out.println(servletRequest + "is destroyed : ");
		System.out.println("\n##############\n");
	}

	
}
