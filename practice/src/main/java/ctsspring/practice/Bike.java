package ctsspring.practice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle{
	
	@Autowired
	private tyre tire;
	
	public tyre getTyre() {
		return tire;
	}

	public void setTyre(tyre tire) {
		this.tire = tire;
	}

public void drive(){
	System.out.println("Bike"+tire.tostring() );
}
}
