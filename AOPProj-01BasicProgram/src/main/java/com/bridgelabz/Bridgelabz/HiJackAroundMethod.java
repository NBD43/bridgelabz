package com.bridgelabz.Bridgelabz;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HiJackAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Method name:"+methodInvocation.getMethod().getName());
		System.out.println("method agrument"+Arrays.toString(methodInvocation.getArguments()));
		System.out.println("HiJackAroundMethod:::Before method Hijacked");
		
		try {
			Object result=methodInvocation.proceed();
			System.out.println("HiJackAroundMethod::before after HiJacked");
			return result;
			
		}catch(IllegalArgumentException e) {
			System.out.println("HiJackAroundMethod.throw eception Hijacked!");
			throw e;
		}
		
	}

}
