package designpatterns.command_pattern;

public class GameOffCommand implements Command {

	private Game game;
	
	public GameOffCommand(Game game) {
		this.game = game;
	}

	@Override
	public void undo() {
		new GameOnCommand(this.game).execute();
	}

	@Override
	public void execute() {
		game.end();
	}

}
