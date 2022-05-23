package designpatterns.chain_of_responsibilities;

public abstract class RequestHandler {
	
	private RequestHandler nextHandler;
	
	public RequestHandler(RequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public void handle(Request request) {
		if(nextHandler != null) {
		System.out.println("main handle process");
		nextHandler.handle(request);
		}
	}
}
