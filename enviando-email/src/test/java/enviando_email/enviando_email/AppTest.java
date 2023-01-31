package enviando_email.enviando_email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private String userName = "joaowoltermail@gmail.com";
	private String senha = "snjkfvjkbhgfcjmq";

	@org.junit.Test
	public void testeEmail() {

		try {

			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.clas", "javax.net.ssl.SSLSocketFactory");

			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, senha);
				}
			});

			System.out.println("teste");

			Address[] toUser = InternetAddress.parse("joaowoltermail@gmail.com");
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Chegou email teste");
			message.setText("Corpo do email");

			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
