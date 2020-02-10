
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wangechi
 */
public class PushNotification {

    static ExecutorService executorService = Executors.newFixedThreadPool(2);
//   static private HashMap<String, String> responseMap;

    public static void main(String args[]) {

        HashMap messageMap = new HashMap();
        executorService.execute(new Notificationservice(messageMap));
//            NotificationFactory nf = new NotificationFactory("");
//            HashMap messageMap = new HashMap();
//            nf.getNotify("sms").push(messageMap);
    }

}
