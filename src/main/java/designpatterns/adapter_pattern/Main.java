package designpatterns.adapter_pattern;

import designpatterns.adapter_pattern.security.LoginHandler;

public class Main {

	public static void main(String[] args) {
		AccountUserDetailsService accountUserDetailsService = new AccountUserDetailsService(new AccountService());
		LoginHandler loginHandler = new LoginHandler(accountUserDetailsService);
		String res = loginHandler.login("name", "password");
		System.out.println(res);
	}

}
