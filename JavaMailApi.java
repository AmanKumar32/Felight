package hhh;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailApi{
	
public boolean sendMail(String to, String subject, String body) {
		final String username = "@gmail.com";
		final String password = "";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
		}
		});

		try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("prakash.ratre3500@gmail.com"));
		message.setRecipients(Message.RecipientType.TO,
		InternetAddress.parse(to));
		message.setSubject(subject);
		message.setText(body);

		Transport.send(message);

		return true;

		} catch (MessagingException e) {
			e.printStackTrace();
		return false;
		}
		}
}


