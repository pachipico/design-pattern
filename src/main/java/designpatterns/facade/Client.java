package designpatterns.facade;

import javax.mail.MessagingException;

public class Client {

	public static void main(String[] args) throws MessagingException {
		EmailSettings emailSettings = new EmailSettings();
		emailSettings.setHost("127.0.0.1");
		EmailMessage emailMessage = new EmailMessage();
		emailMessage.setFrom("pachipico1@gmail.com");
		emailMessage.setTo("pachipico@naver.com");
		emailMessage.setSubject("title");
		emailMessage.setText("something very serious.");
		EmailSender emailSender = new EmailSender(emailSettings);
		emailSender.sendMessage(emailMessage);
	}
}
