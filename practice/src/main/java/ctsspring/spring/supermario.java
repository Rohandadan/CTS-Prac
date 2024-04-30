package ctsspring.spring;

import org.springframework.stereotype.Component;

@Component
public class supermario implements gameinterface {

	public void up() {
		System.out.println("jumppppp");
		
	}

	public void down() {
		System.out.println("cramppppp");
		
	}

	public void right() {
		System.out.println("fasttttt");
		
	}

	public void left() {
		System.out.println("stoppppp");
		
	}

}
