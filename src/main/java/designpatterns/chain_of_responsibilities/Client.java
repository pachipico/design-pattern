package designpatterns.chain_of_responsibilities;

public class Client {

	private RequestHandler requestHandler;

	public Client(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
	}

	public void doWork() {
		Request request = new Request("Request Body");
		requestHandler.handle(request);
	}
	
	public static void main(String[] args) {
		RequestHandler chain = new AuthHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
		Client client = new Client(chain);
		client.doWork();
	}

}
