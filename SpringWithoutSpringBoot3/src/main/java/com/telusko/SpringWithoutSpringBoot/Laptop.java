package com.telusko.SpringWithoutSpringBoot;

public class Laptop implements Computer {
	
	 public Laptop() {
			System.out.println("Laptop");
		}
	public void compile() {
		System.out.println("Laptop Compiling");
	}
}
