package com.gusg3.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DoBeforeAspect {
	
	@Before("execution(* com.gusg3.service.SimpleService.sayHello(..)))")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("***AspectJ*** DoBefore is running ! intercepted : "
				+ joinPoint.getSignature().getName());
	}

}
