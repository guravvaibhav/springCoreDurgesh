package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAspect {
	public static void main(String[] args) {
		ApplicationContext ct= new AnnotationConfigApplicationContext(Aspect.class);
		Main bean = ct.getBean(Main.class);
		bean.createPojo(10);
	}

}
