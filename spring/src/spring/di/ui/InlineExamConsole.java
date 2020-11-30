package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired
	// @Autowired(required=false) 
	//@Qualifier("exam1")//Qualifier("exam1")Bean의 메서드 중 id="exam1"과 일치하는 값을 불러온다.
	private Exam exam;
	public InlineExamConsole() {
		System.out.println("constructor");
		// TODO Auto-generated constructor stub
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("Overoad constructor");
	
		this.exam = exam;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(exam==null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(),exam.avg());
	}
	
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("setter");
		this.exam=exam;
	}
}
