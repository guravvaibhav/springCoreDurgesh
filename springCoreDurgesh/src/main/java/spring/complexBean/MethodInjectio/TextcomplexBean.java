package spring.complexBean.MethodInjectio;

// - here outer(main)bean is singlton but inner (dependent)bean is with prototype scope
// but as outer bean is initiatate at one time only(coz its scope is singleton)everytime we will get same dependent bean 
// which is inside main bean (here dependent is of prototype then also)
// - but our requirement is every time new dependent is returned...

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextcomplexBean {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("ComplexBeanCfg.xml");
		Main m1=ct.getBean("main",Main.class);
		Main m2=ct.getBean("main",Main.class);
		System.out.println(m1.getD()==m2.getD());
	}
}
