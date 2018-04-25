package security;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author toshiba
 */
public class SendEmail {

    public static String send(String from, String password, String to, String sub, String link,String token) {
        //Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText("");
            message.setContent("<html lang=\"en\">\r\n" + 
            		"  <head>\r\n" + 
            		"  <meta charset=\"utf-8\">\r\n" + 
            		"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
            		"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
            		"  <title>USTH | Reset Password</title>\r\n" + 
            		"  \r\n" + 
            		"  <!-- CSS -->\r\n" + 
            		"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">\r\n" + 
            		"  <link rel=\"stylesheet\" href=\"fonts/open-sans.css\">\r\n" + 
            		"  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n" + 
            		"  <link rel=\"icon\" href=\"https://i.imgur.com/bwbWypp.png\">\r\n" + 
            		"  <!-- END OF CSS -->\r\n" + 
            		"  </head>\r\n" + 
            		"    <body style=\"color: #023564;\" class=\"container-fluid\">   \r\n" + 
            		"    <div class=\"col-md-4 col-md-offset-4 forgotpassword__tabcontent\">\r\n" + 
            		"      <img class=\"login__logo\" alt=\"USTH Logo\" src=\"https://i.imgur.com/bwbWypp.png\">\r\n" + 
            		"        <h5 class=\"login__logotext login__logotext--position\" style=\"margin-bottom: 10px; font-weight: bold;\">\r\n" + 
            		"          UST BENAVIDES<br>CANCER<br>INSTITUTE\r\n" + 
            		"        </h5>\r\n" + 
            		"      <div class=\"row col-md-10 col-md-offset-2\" style=\"margin: 20px 20px;\">\r\n" + 
            		"        We have received a password change request for your BCI Account.<br><br>\r\n" + 
            		"        If you did not ask to change your password, then you could ignore\r\n" + 
            		"        this email and your password will not be changed. The link below \r\n" + 
            		"        will remain active for 24 hours.\r\n" + 
            		"      </div>\r\n" + 
            		"      <a href=\""+link+token+"\">Reset Here</a> \r\n" + 
            		"\r\n" + 
            		"    </div>\r\n" + 
            		"    </body>\r\n" + 
            		"  <!-- JS -->\r\n" + 
            		"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>\r\n" + 
            		"  <!-- END OF JS -->\r\n" + 
            		"</html>", "text/html");
            //send message  
            Transport.send(message);
            return "Message sent. Please check the E-mail you have provided";
        } catch (MessagingException e) {
            return e.getMessage();

        }

    }
}
