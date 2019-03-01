import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		System.out.println("\n##################\n");
		System.out.println("sessionCreated method is started " +this.getClass().getName());
		HttpSession session = httpSessionEvent.getSession();
		System.out.println(session + "Created:");
		System.out.println("ID=" + session.getId() + "MaxInactiveInterval = " + session.getMaxInactiveInterval());
		System.out.println("\n##################\n");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		
		System.out.println("\n##################\n");
		System.out.println("sessionDestroyed method is started " +this.getClass().getName());
		HttpSession session = httpSessionEvent.getSession();
		System.out.println(session + "Destroyed:");
		System.out.println("ID=" + session.getId() + "MaxInactiveInterval = " + session.getMaxInactiveInterval());
		System.out.println("\n##################\n");
		
	}

}
