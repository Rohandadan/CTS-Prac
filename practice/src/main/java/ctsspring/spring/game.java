package ctsspring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class game {
	@Autowired
	private gameinterface gamer;

	public game(gameinterface gamer) {
		this.gamer = gamer;
	}
	
	public void functions() {
		gamer.down();
		gamer.up();
		gamer.left();
		gamer.right();
	}

	
}
