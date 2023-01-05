package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct=new AnnotationConfigApplicationContext(Main.class);
		Main abc=ct.getBean(Main.class);
		abc.m(10);
	}

}
