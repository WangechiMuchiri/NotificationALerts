/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
public class NotificationFactory {

    private String action_type;

    public NotificationFactory(String action_type) {
        this.action_type = action_type;
    }

    public Notification getNotify(String action_type) {
        if (action_type.equalsIgnoreCase("Email")) {
            return new NotifyEmailImpl();
        } else if (action_type.equalsIgnoreCase("SMS")) {
            return new NotifySmsImpl();
        } else {
            return null;
        }

    }
}
