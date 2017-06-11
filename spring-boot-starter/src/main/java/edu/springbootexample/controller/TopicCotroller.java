package edu.springbootexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springbootexample.pojo.Topic;

@RestController
@RequestMapping("/topic")
public class TopicCotroller {

	@RequestMapping("/topicsList")
	public List<Topic> getTopicList(){
		return Arrays.asList (
				new Topic("jay","9403700724"),
				new Topic("Vijay","9544333333")
				);
	}
	
}
