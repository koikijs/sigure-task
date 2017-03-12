package koikijs.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyTaskApplication implements CommandLineRunner {
	@Autowired
	private OutputSource outputSource;
	
	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Hello World, Spring Cloud Task!");
		outputSource.output1().send(MessageBuilder.withPayload("aaa ttt").build());
	}
}