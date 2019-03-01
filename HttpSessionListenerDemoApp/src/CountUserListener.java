import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountUserListener implements HttpSessionListener {
	ServletContext ctx = null;
	static int totalUserCount = 0, currentUserCount = 0;
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		System.out.println(httpSessionEvent.getSession().getServletContext());
		System.out.println("sessionCreated method is started " +this.getClass().getName());
		totalUserCount++;
		currentUserCount++;
		System.out.println(httpSessionEvent.getSession().getId());
		System.out.println("increment users");
		System.out.println(totalUserCount);
		System.out.println(currentUserCount);
		ctx = httpSessionEvent.getSession().getServletContext();
		ctx.setAttribute("totalusers", totalUserCount);
		ctx.setAttribute("currentusers", currentUserCount);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		System.out.println("sessionDestroyed method is started " +this.getClass().getName());
		
		currentUserCount--;
		ctx.setAttribute("currentusers", currentUserCount);
		
		
	}

}
