package io.fzoozai.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics	() {
		return Arrays.asList(
					new Topic("1", "Fabian", "TBE"),
					new Topic("2", "Nani", "Portugal"),
					new Topic("3", "Potter", "Hogwards")
				);
	}
}
