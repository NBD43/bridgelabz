package com.bridgelabz.Bridgelabz;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HiJackBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HiJackBeforeMethod.before()");

	}

}
