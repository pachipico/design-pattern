package designpatterns.command_pattern;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void undo() {
		new LightOnCommand(this.light).execute();
	}

	@Override
	public void execute() {
		light.off();
	}

}
