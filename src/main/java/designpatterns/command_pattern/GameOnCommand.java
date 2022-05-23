package designpatterns.command_pattern;

public class GameOnCommand implements Command {
	
	private Game game;
	
	public GameOnCommand(Game game) {
		this.game = game;
	}

	@Override
	public void undo() {
		new GameOffCommand(this.game).execute();
	}

	@Override
	public void execute() {
		game.start();
	}

}
