package excludeFilterOfComponentScan;

import org.springframework.stereotype.Component;

@Component
public class B {

	public B() {
		super();
		System.out.println("B class..!!!");
	}
}
