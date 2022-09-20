package com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.Entity.Topic;

public interface TopicRespository extends CrudRepository<Topic,String>{

	

}
