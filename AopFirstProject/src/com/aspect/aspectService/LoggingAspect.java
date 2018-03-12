package com.aspect.aspectService;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters() && allCirclemethods()")
	public void AspectAdvice() {
		System.out.println("aspectAdvice run. get method called");
	}
	@After("allCirclemethods()")
	public void AspectAdvice1() {
		System.out.println("aspectAdvice run after. get method1 called");
	}

	@Before("allCirclemethods()")
		public void secondAdvice(JoinPoint joinpoint) {
			System.out.println(joinpoint.toString());
			System.out.println("this is using joinpoint as arguments in advice");
		}
	@Before("args(name)")
	public void StringArgumentMethods(String name) {
		System.out.println("printing before argument methods:"+name);
	}
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void StringArgumentMethods1(String name, String returnString) {
		System.out.println("printing before argument  methods1 returning:"+name +" output:"+returnString);
	}
	@AfterThrowing(pointcut="args(name)", throwing="exce")
	public void StringArgumentMethods2(String name, RuntimeException exce) {
		System.out.println("printing before argument methods1 return:"+name +" output:"+exce);
	}
	@Around("@annotation(com.aspect.aspectService.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingjoinpoint) {
		
		Object returnValue = "null";
		try {
			System.out.println("before target"+returnValue);
			returnValue = proceedingjoinpoint.proceed();
			returnValue = "ravi";
			System.out.println("after target"+returnValue);
		} catch (Throwable e) {
			System.out.println("after thorwing");
			e.printStackTrace();
		}
		
		System.out.println("after finally"+returnValue);
		return "raju";
	}
	@Pointcut("execution( * get*())")
	public void allGetters() {};
	
	
	@Pointcut("within(com.aspect.model.*)")
	public void allCirclemethods() {};
	
	public void loggingAdvice() {
		System.out.println("am an advice applied on user created factroy");
		
	}
}

