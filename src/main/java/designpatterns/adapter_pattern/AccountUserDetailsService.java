package designpatterns.adapter_pattern;

import designpatterns.adapter_pattern.security.UserDetails;
import designpatterns.adapter_pattern.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
	
	private AccountService accountService;
	
	public AccountUserDetailsService(AccountService accountService) {
		this.accountService = accountService;
	}
	

	@Override
	public UserDetails loadUserByUsername(String username) {
		UserDetails account = accountService.findAccountByUsername(username);
		return account;
	}

}
