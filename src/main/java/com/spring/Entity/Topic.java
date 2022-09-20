package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Topic {
	
	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String desc_;
	

	public Topic(){

	}
	
	
	public Topic(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc_ = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc_;
	}
	public void setDesc(String desc) {
		this.desc_ = desc;
	}
	

}
