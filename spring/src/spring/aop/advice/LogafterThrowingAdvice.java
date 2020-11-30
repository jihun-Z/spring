package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogafterThrowingAdvice implements ThrowsAdvice {
	//ThrowsAdvice  어떤함수를쓰는야에따라서 예외처리가 달라지기때문에 특정짓기어렵기때문에
	// 기본값이 default값이다
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다: "+e.getMessage());
	}
}
