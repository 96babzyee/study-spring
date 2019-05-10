package com.busanit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	@Pointcut(value="execution(* com.busanit..*.run(..))")
	private void runPointcut(){}
	
	@Before("runPointcut()")
	public void beforeLog(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[Log: Before] 메서드 이름 : " + signature.getName());
	}

	@AfterReturning(pointcut="runPointcut()", returning="message")
	public void beforeReturningLog(JoinPoint joinPoint, String message) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[Log: beforeReturning] 메서드 이름 : " + signature.getName());
		System.out.println("[Log: beforeReturning] 메서드 리턴 값 : " + message);
	}

	@AfterThrowing(pointcut="runPointcut()", throwing="exception")
	public void  beforeThrowingLog(JoinPoint joinPoint, Exception exception) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[Log: beforeThrowing] 메서드 이름 : " + signature.getName());
		System.out.println("[Log: beforeThrowing] 예외 발생 : " + exception.getMessage());
	}

}
