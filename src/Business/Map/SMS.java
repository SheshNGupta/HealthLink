/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Map;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Shesh Narayan
 */
public class SMS {
    
    //public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    //public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void SendSMS(String to, String msg){
        final String ACCOUNT_SID = "ACc96e97c5c585f0ed3073888c5dbebd82";
        final String AUTH_TOKEN = "b8cb1cce7ae39a9b53429d95d1e10083";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber("+18053032447"),
                msg)
            .create();

        System.out.println(message.getSid());
    }
}
