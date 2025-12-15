package com.telusko.SpringWithoutSpringBoot;

public class Dev {
	private Laptop laptop;
	private int age;

	public Dev() {
		System.out.println("Developer");
	}

	public Dev(int age) {

		this.age = age;
		System.out.println("Parmeterized Constructor");
	}
	

	public Dev(Laptop laptop) {
		
		this.laptop = laptop;
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
		laptop.compile();

	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
