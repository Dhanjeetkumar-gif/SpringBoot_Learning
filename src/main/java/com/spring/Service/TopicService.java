package com.spring.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.Entity.Topic;
import com.spring.repository.TopicRespository;

@Service
public class TopicService {
	@Autowired
	private TopicRespository topicRepository;
//	private List<Topic> alltopics= new ArrayList<>(Arrays.asList(new Topic(11,"java","OOPs language"),
//			new Topic(12,"java script","scripting language"),
//			new Topic(13,"python","new language")
//			));
//   

	public List<Topic> getAllTopics() {
		
		//return alltopics;
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
   public Optional<Topic> getTopicById(int id) {
	  // String ids=String.valueOf(id);
	 return  topicRepository.findById(id);
	  // return alltopics.stream().filter(t-> t.getId()==id).findFirst().get();
	
	   
   }
public void addTopic(Topic topic) {
	//alltopics.add(topic);
	topicRepository.save(topic);
}
public void updateTopic(int id, Topic topic) {
	topicRepository.save(topic);
//	for(int i=0;i<alltopics.size();i++) {
//		Topic t=alltopics.get(i);
//		if(t.getId()==id) {
//			alltopics.set(i, topic);
//			return;
//		}
//	}
//	
}
public void deleteTopic(int id) {
	//String ids=String.valueOf(id);
	topicRepository.deleteById(id);

	
	
	
//	for(int i=0;i<alltopics.size();i++) {
//		Topic t=alltopics.get(i);
//		if(t.getId()==id) {
//			alltopics.remove(i);
//			return;
//		}
//}
//}
}
}
