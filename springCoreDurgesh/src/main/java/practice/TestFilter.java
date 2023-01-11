package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestFilter {
	public static void main(String[] args) {
		ApplicationContext ct=new AnnotationConfigApplicationContext(MainFilter.class);
	}

}
