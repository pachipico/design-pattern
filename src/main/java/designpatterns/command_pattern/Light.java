package designpatterns.command_pattern;

public class Light  {

	private boolean isOn;
	
	public Light() {
		this.isOn = false;
	}
	
	public void off() {
		System.out.println("종료");
		this.isOn = false;
	}

	public void on() {
		System.out.println("시작");
		this.isOn = false;
	}

	
}
