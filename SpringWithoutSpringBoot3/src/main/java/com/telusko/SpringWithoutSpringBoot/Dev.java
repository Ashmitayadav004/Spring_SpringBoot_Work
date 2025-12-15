package com.telusko.SpringWithoutSpringBoot;

public class Dev {
	private Computer comp;;

	public Dev() {
		System.out.println("Developer");
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public void build() {

		System.out.println("Cracking Google Off Campus Soon");
		comp.compile();

	}

}
