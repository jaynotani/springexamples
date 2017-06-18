package edu.springbootexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.springbootexample.pojo.Topic;
import edu.springbootexample.service.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicCotroller {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping(value="/topicsList", method= RequestMethod.GET)
	public List<Topic> getTopicList(){
		return Arrays.asList (
				new Topic("jay","9403700724","c302"),
				new Topic("Vijay","9544333333","auto"),
				new Topic("Pritesh","953333333","c302")
				);
	}
	
	@RequestMapping("/topics")
	public List<Topic> getTopicList2(){
		return this.topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{name}")
	public Topic getTopicByName(@PathVariable String name){
		return topicService.getTopic(name);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	
}
