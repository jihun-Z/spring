package spring.aop.advice;

import java.lang.reflect.Method;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.aop.AfterReturningAdvice;

public class LogafterReturningAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("returnValue"+returnValue+",method:"+method.getName());
	}

}
