package designpatterns.observer;

public class Client {

	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();
		
		User jim = new User("jim");
		User tom = new User("tom");
		chatServer.register(jim, "java");
		chatServer.register(tom, "java");
		chatServer.register(jim, "dragon");
		chatServer.sendMessage(jim, "dragon", "sadfsf");
		
	}
}
