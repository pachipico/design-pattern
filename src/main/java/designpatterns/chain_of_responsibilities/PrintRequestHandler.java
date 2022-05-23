package designpatterns.chain_of_responsibilities;

public class PrintRequestHandler extends RequestHandler {

	public PrintRequestHandler(RequestHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handle(Request request) {
		System.out.println("Print request handler.");
		super.handle(request);
	}

}
