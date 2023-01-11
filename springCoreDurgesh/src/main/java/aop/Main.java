package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
@EnableAspectJAutoProxy
public class Main {
	public int m(int i) {
		System.out.println("!!!.. METHOD M EXECUTING..!!!");
		return i*i;
	}

	@Override
	public String toString() {
		return "*****Main Class*****";
	}
	

}
