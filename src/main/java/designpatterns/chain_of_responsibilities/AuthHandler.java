package designpatterns.chain_of_responsibilities;

public class AuthHandler extends RequestHandler{

	public AuthHandler(RequestHandler nextHandler) {
		super(nextHandler);
	}
	
	@Override
	public void handle(Request request) {
		System.out.println("인증 관련 처리");
		super.handle(request);
	}

}
