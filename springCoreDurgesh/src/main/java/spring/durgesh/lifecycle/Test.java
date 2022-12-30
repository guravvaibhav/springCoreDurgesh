package spring.durgesh.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("samosaCfg.xml");
		Samosa bean = ctx.getBean("samosa",Samosa.class);
		System.out.println(bean);
		
	}

}
