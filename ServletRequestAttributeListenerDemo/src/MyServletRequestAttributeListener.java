import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("\n##############\n");
		System.out.println("attributeAdded method is called in" +this.getClass().getName());
		System.out.println("Newly added attribute name =" 
		+servletRequestAttributeEvent.getName() + ",value = "+servletRequestAttributeEvent.getValue());
		System.out.println("\n##############\n");
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("\n##############\n");
		System.out.println("attributeRemoved method is called in" +this.getClass().getName());
		System.out.println("Attribute removed =" 
		+servletRequestAttributeEvent.getName() + ",value = "+servletRequestAttributeEvent.getValue());
		System.out.println("\n##############\n");
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("\n##############\n");
		System.out.println("attributeReplaced method is called in" +this.getClass().getName());
		System.out.println("Attribute replaced =" 
		+servletRequestAttributeEvent.getName() + ",value = "+servletRequestAttributeEvent.getValue());
		System.out.println("\n##############\n");
		
		
	}

}
