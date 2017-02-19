package koikijs.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SigureTaskApplication {
 	@Bean
  	public MyTaskApplication myTask() {
  		return new MyTaskApplication();
  	}
 	
	public static void main(String[] args) {
		SpringApplication.run(SigureTaskApplication.class, args);
	}

	public static class MyTaskApplication implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			System.out.println("Hello World, Spring Cloud Task!");
		}
	}
}
