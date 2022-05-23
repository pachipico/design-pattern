package designpatterns.command_pattern;

public class LightOnCommand implements Command{

	private Light light;
	
	
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void undo() {
		new LightOffCommand(this.light).execute();
	}

	@Override
	public void execute() {
		light.on();
	}

}
