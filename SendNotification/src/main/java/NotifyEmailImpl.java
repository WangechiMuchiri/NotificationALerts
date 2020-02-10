
import java.util.HashMap;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wangechi
 */
public class NotifyEmailImpl implements Notification {
    //NotificationInterface notificationInterface = new NotifyEmailImpl();

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void push(HashMap<String, String> responseMap) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            Email mail = new Email();

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), ""));
            mimeMessageHelper.setTo(mail.getMailTo());
            mimeMessageHelper.setText(mail.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());
            System.out.println("Sending Email message" + responseMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
