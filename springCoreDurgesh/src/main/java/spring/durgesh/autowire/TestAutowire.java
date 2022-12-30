package spring.durgesh.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autowireCfg.xml");
		Employee emp1=ctx.getBean("employee", Employee.class);
		System.out.println(emp1);
	}

}
