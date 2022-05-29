package designpatterns.memento;

public class Client {
	
	
	
	public static void main(String[] args) {
		Game game = new Game();
		
		game.setBlueTeamScore(10);
		game.setRedTeamScore(23);
		
		GameSave saveFile = game.save();
		
		game.restore(saveFile);
	}

}
