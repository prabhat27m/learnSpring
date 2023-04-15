package com.springcore.ci;

public class Person {
	private String name;
	private int personid;
	private Certificate c;
	
	public Person(String name, int personId, Certificate c) {
		this.name=name;
		this.personid= personId;
		this.c=c;
		
	}
	@Override
	public String toString(){
		return this.name+" "+this.personid +" " + this.c;
	}
}
