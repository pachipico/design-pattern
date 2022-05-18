package designpatterns.facade;

public interface EmailSettingsBuilder {
	EmailSettingsBuilder setTo(String to);
	EmailSettingsBuilder setFrom(String from);
	EmailSettingsBuilder setHost(String host);
	EmailSettings build();
}
