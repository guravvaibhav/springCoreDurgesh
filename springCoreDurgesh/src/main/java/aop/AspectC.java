package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectC {
	
//	@Before("execution(* Main.m(..))")
//	public void log1() {
//		System.out.println("m method started..");
//	}
//	@AfterReturning("execution(* Main.m(..))")
//	public void log2() {
//		System.out.println("m method ended successfully..");
//	}
//	@After("execution(* Main.m(..))")
//	public void log3() {
//		System.out.println("m method ended..");
//	}
//	@AfterThrowing("execution(* Main.m(..))")
//	public void log4() {
//		System.out.println(" exception occured in m method..");
//	}
	
	@Around("execution(* Main.m(..))")
	public int log5(ProceedingJoinPoint pjp) throws Throwable {
		int args =(Integer) pjp.getArgs()[0];
		System.out.println("method m started by passing parameter : "+args);
		int rt =(Integer) pjp.proceed();
		System.out.println("method m ended by returning value : "+rt);
		return rt;
	}
}
