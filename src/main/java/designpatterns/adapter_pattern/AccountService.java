package designpatterns.adapter_pattern;

import designpatterns.adapter_pattern.security.UserDetails;
import designpatterns.adapter_pattern.security.UserDetailsService;

public class AccountService implements UserDetailsService {

	public Account findAccountByUsername(String username) {
		Account account = new Account();
		account.setEmail("email");
		account.setName("name");
		account.setPassword("password");
		return account;
	}
	
	public void createNewAccount(Account account) {
		

	}
	
	public void updateAccount(Account account) {
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		return findAccountByUsername(username);
	}

}
