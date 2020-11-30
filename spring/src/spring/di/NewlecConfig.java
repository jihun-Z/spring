package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlectExam;

@ComponentScan("spring.id.ui")
@Configuration
public class NewlecConfig {
	
	
	@Bean
	public Exam exam () {
		
		return new NewlectExam();
	}

}
