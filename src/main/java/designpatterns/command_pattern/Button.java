package designpatterns.command_pattern;

import java.util.Stack;

public class Button {
	private Stack<Command> commands = new Stack<>();
	
	public Button() {
		
	}
	
	public void press(Command command) {
		command.execute();
		commands.add(command);
	}
	
	public void undo() {
		if(!commands.isEmpty()) {
		Command command = commands.pop();
		command.undo();
		}
	}
	
	public static void main(String[] args) {
		Button button = new Button();
		button.press(new LightOnCommand(new Light()));
		button.press(new GameOnCommand(new Game()));
		button.undo();
		button.undo();
	}
	
}
