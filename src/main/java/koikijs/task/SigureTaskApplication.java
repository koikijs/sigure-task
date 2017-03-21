package koikijs.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
//@EnableBinding(OutputSource.class)
public class SigureTaskApplication {
 	@Bean
  	public MyTaskApplication myTask() {
  		return new MyTaskApplication();
  	}
 	
	public static void main(String[] args) {
		SpringApplication.run(SigureTaskApplication.class, args);
	}
}
