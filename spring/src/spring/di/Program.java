package spring.di;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlectExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		
		//스프링에게 지시하는 방법으로 코드를 변경
		
		
		//		Exam exam=new NewlectExam();
//		//ExamConsole console=new InlineExamConsole(exam);
//		ExamConsole console=new GridExamConsole();
//		console.setExam(exam);
		
		//Annotation등록하기
		ApplicationContext context =
				new AnnotationConfigApplicationContext(NewlecConfig.class);
		
		//xml로 등록할때
		//ApplicationContext context =
				//new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		
		/*//Annotation여러개등록하기
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
				**   ctx.register(AppConfig.class, OtherConfig.class);
		ctx.register(NewlecConfig.class);
		ctx.refresh();
		*/
		
		//Exam exam=context.getBean(Exam.class);
		//System.out.println(exam);
		ExamConsole console=(ExamConsole) context.getBean("console");
		
		//ExamConsole console=context.getBean(ExamConsole.class);
		console.print();
		
		//context.Bean("")이름으로 가져올때
		//context.getBean(Exam.class) 클래스로 가져올때
		//List xml에서 생성하기
		//List<Exam> exams=(List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlectExam(1,1,1,1));
		//System.out.println("이건뭐니?"+exam);
		//System.out.println("이건 먼저출력하는exams"+exams);
		//for(Exam e: exams)
			//System.out.println(e);
		
		
	}

}
