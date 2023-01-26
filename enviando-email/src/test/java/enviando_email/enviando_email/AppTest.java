package enviando_email.enviando_email;

import java.net.Authenticator;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private String userName = "joaowoltermail@gmail.com";
	private String senha = "Mayalove10#";

	@org.junit.Test
	public void testeEmail() {

		try {

			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "stmp.gmail.com");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.clas", "javax.net.ssl.SSLSocketFactory");
			
			Session session - Session.getInstance(properties,new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, senha);
				}
			});
			
			System.out.println(senha);
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
