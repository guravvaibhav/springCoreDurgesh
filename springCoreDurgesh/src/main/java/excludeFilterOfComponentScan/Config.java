 package excludeFilterOfComponentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(excludeFilters = @ComponentScan.Filter(type =FilterType.ASPECTJ,pattern = "excludeFilterOfComponentScan.A"))
@ComponentScan(basePackages ="excludeFilterOfComponentScan",
includeFilters = @ComponentScan.Filter(type =FilterType.ASPECTJ,pattern = "read_properties.Config"))
public class Config {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct=new AnnotationConfigApplicationContext(Config.class);
//		AnnotationConfigApplicationContext ct1=new AnnotationConfigApplicationContext(read_properties.Config.class);
//		ct1.getBean("con");
	}

}
