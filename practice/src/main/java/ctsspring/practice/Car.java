package ctsspring.practice;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle{
	public void drive() {
		System.out.println("It is Carrrrrr!!!!");
}
}
