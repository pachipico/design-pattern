package designpatterns.facade;

import javax.mail.Message.RecipientType;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
	
	private EmailSettings emailSettings;
	
	public EmailSender(EmailSettings emailSettings) {
		this.emailSettings = emailSettings;
	}
	
	
	public void sendMessage(EmailMessage emailMessage) throws MessagingException {
		String to = "pachipico@naver.com";
		String from = "pachipico1@gmail.com";
		String host = "127.0.0.1";

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", emailSettings.getHost());

		Session session = Session.getDefaultInstance(properties);

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(emailMessage.getFrom()));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailMessage.getTo()));
			message.setSubject(emailMessage.getSubject());
			message.setText(emailMessage.getText());

			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		} 
	}
}
