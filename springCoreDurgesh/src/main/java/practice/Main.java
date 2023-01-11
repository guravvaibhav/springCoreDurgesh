package practice;

import org.springframework.stereotype.Component;

@Component
public class Main {
	public POJO createPojo(int i) {
	System.out.println("creating pojo");
		return new POJO(i);
	}

}
