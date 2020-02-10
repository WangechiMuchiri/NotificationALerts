
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
public class NotifySmsImpl implements Notification {

    @Override
    public void push(HashMap<String, String> responseMap) {
        responseMap.put("From","+254763063000");
        responseMap.put("To","XXXXXXX");
        responseMap.put("text","XYXYXYYXXXXXY");
        System.out.println("sending SMS message " + responseMap);
    
}}
