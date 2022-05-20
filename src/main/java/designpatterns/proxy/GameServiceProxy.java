package designpatterns.proxy;

public class GameServiceProxy implements GameService {

	private GameService gameService;
	

	@Override
	public void startGame() throws InterruptedException {
		Long before = System.currentTimeMillis();
		if(gameService == null) this.gameService = new DefaultGameService();
		gameService.startGame();
		Thread.sleep(1000L);
		System.out.println(System.currentTimeMillis() - before);
		
	}

	
	
	
}
