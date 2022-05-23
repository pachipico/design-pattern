package designpatterns.command_pattern;

import java.util.Stack;

public class MyApp {
	
	private Stack<Command> commands = new Stack<>();

	public MyApp() {
		
	}

	public void press(Command command) {
		command.execute();
		commands.add(command);
	}
	
	private void undo()	{
		if(!commands.isEmpty()) {
		Command command = commands.pop();
		command.undo();
		}
	}
	
	public static void main(String[] args) {
		MyApp myApp = new MyApp();
		myApp.press(new GameOnCommand(new Game()));
		
		myApp.undo();
	}
}
