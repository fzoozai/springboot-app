package io.fzoozai.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("1", "Fabian", "TBE"),
			new Topic("2", "Nani", "Portugal"),
			new Topic("3", "Potter", "Hogwards")
		);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
}
