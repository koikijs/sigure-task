package koikijs.task;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputSource {
	//String OUTPUT1 = "output1";

	//@Output(OUTPUT1)
	@Output
	MessageChannel output1();
}
