package springcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		MyBean bean1 = context.getBean(MyBean.class);
		MyBean bean2 = context.getBean(MyBean.class);
		
		bean1.doSomething();
		bean2.doSomething();
		
		Vehiculo v=context.getBean(Vehiculo.class);
		v.acelerar();

	}
	
	
	

}
