package read_properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct=new AnnotationConfigApplicationContext(Config.class);
		Connections connections = ct.getBean("con",Connections.class);
		System.out.println(connections);
	}

}
