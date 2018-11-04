package com.examplepdf.demo.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwilioMessageService {

    public void sendSMS(String senderNumber, String message){
        String ACCOUNT_SID = "AC5eb2291fc32feefffaee1e72124744c8";
        String AUTH_TOKEN ="3ad8aa83519e4a57147810b324f4fca2";
        String myTwilioNumber = "+15067006522";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
       Message.creator(new PhoneNumber(senderNumber), new PhoneNumber(myTwilioNumber), message).create();

    }
}
