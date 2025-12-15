package com.telusko.DemoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	@Autowired
	private Laptop laptop;
	public void build() {
		laptop.compile();
		System.out.println("Cracking Google Off Campus Soon");
		laptop.compile();
	}

}
