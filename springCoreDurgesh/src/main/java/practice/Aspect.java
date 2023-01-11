package practice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
@org.aspectj.lang.annotation.Aspect
public class Aspect {
	@Around("execution(* Main.createPojo(..))")
	public void log1(ProceedingJoinPoint pjp) throws Throwable {
		int i=(Integer)pjp.getArgs()[0];
		System.out.println("method started with para "+i);
		Object proceed = pjp.proceed();
		System.out.println("method ended with returning "+proceed);
	}

}
