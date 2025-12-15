package com.telusko.SpringWithoutSpringBoot;

public class Dev {
private int age ;
    public Dev() {
		System.out.println("Developer");
	}
    
	public Dev(int age) {
	
		this.age = age;
		System.out.println("Parmeterized Constructor");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void build() {

		System.out.println("Cracking Google Off Campus Soon");

	}

}
