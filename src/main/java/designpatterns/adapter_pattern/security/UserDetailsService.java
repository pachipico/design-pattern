
package designpatterns.adapter_pattern.security;

public interface UserDetailsService {
	UserDetails loadUserByUsername(String username);
}
