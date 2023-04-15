package com.springcore.ci;

public class Certificate {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
}
