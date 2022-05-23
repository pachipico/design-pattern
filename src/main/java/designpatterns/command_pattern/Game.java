package designpatterns.command_pattern;

public class Game  {

	private boolean isOn;
	
	public Game() {
		this.isOn = false;
	}

	
	public void start() {
		System.out.println("game starting...");
		this.isOn = true;
	}


	public void end() {
		System.out.println("game turning off");
		this.isOn = false;
	}
	

}
