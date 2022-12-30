package spring.durgesh.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
	public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("collectionCfg.xml");
	Question que1 = ctx.getBean("que1",Question.class);
	
	System.out.println(que1.getqId());					//id
	System.out.println(que1.getQuestion());				//question
	System.out.println(que1.getAnswers());			 	//answers -		list
	System.out.println(que1.getMob());					//mob -			set
	System.out.println(que1.getBook_Price());			//book_price -	map
	System.out.println(que1.getBookAuth());				//bookAuth -	properties
	
	
	}
	
	
}
