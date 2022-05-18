package designpatterns.facade;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Client {

	public static void main(String[] args) {
		String to = "pachipico@naver.com";
		String from = "pachipico1@gmail.com";
		String host = "127.0.0.1";

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);

		Session session = Session.getDefaultInstance(properties);

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Test Mail from Java Program");
			message.setText("message");

			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
