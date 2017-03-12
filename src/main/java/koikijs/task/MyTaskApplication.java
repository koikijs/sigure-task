package koikijs.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyTaskApplication implements CommandLineRunner {
	@Autowired
	private OutputSource outputSource;
	
	@Override
	public void run(String... strings) throws Exception {
		log.info("Hello World, Spring Cloud Task!");
		outputSource.output1().send(MessageBuilder.withPayload("test queue").build());
	}
}