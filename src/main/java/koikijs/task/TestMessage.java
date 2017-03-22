package koikijs.task;

import java.time.ZonedDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestMessage {
	private String name;
	private ZonedDateTime sysDate;
}
