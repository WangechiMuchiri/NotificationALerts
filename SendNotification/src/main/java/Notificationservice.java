
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static jdk.nashorn.internal.objects.NativeArray.push;
import static jdk.nashorn.internal.objects.NativeArray.push;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wangechi
 */
public class Notificationservice implements Runnable {

    private NotificationFactory nf;
    private HashMap<String, String> messageMap;

    public Notificationservice(HashMap<String, String> messageMap) {
        this.messageMap = messageMap;
    }

    @Override
    public void run() {
        nf = new NotificationFactory(messageMap.get("type"));
        nf.getNotify("email").push(messageMap);
    }

}
