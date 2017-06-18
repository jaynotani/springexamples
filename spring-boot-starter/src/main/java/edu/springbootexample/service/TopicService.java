package edu.springbootexample.service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.springbootexample.pojo.Topic;

@Service
public class TopicService {

	private List<Topic> topicList = new ArrayList<Topic> (Arrays.asList (
			new Topic("jay","9403700724","c302"),
			new Topic("Pritesh","953333333","c302"),
			new Topic("Nirmal","9322332323","c302")
			));
	
	public List<Topic> getAllTopics(){
		return topicList;
	}

	public Topic getTopic(String name){
		return topicList.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topicList.add(topic);
	}

}
