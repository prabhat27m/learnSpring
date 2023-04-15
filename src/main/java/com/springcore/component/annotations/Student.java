package com.springcore.component.annotations;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Prabhat")
	private String name;
	@Value("01JST20IS033")
	private String USN;
	@Value("#{temp}")
	private Map<String, Integer> parents;
	@Value("#{temp1}")
	private List<Integer>phones;
	
	public Student(String name, String uSN, Map<String, Integer> parents, List<Integer> phones) {
		super();
		this.name = name;
		USN = uSN;
		this.parents = parents;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", USN=" + USN + ", parents=" + parents + ", phones=" + phones + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public Map<String, Integer> getParents() {
		return parents;
	}

	public void setParents(Map<String, Integer> parents) {
		this.parents = parents;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
