package spring.durgesh.scope_lazyInitialisation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope_LazyInitialisation {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("studentCfg.xml");
		Student s1 = ctx.getBean("student", Student.class);
		Student s2 = ctx.getBean("student", Student.class);
		System.err.println(s1==s2);
	}

}
