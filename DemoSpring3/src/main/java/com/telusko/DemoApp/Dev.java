package com.telusko.DemoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
//	private Laptop laptop;
	
//	public Dev(Laptop laptop) {
//		
//		this.laptop = laptop;
//	}
	
//@Autowired
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
@Autowired
@Qualifier("laptop")
private Computer comp;

	public void build() {
		comp.compile();
		System.out.println("Cracking Google Off Campus Soon");
//		laptop.compile();
	}

	
}
