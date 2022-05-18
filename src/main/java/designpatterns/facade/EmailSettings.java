package designpatterns.facade;

import java.util.Properties;

import javax.mail.Session;

public class EmailSettings  {
	private String host;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	
}
