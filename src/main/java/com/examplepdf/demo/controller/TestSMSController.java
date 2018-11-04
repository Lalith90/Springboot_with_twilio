package com.examplepdf.demo.controller;


import com.examplepdf.demo.model.User;
import com.examplepdf.demo.service.TwilioMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSMSController {

    private final TwilioMessageService twilioMessageService;

    @Autowired
    public TestSMSController(TwilioMessageService twilioMessageService) {
        this.twilioMessageService = twilioMessageService;
    }

    @RequestMapping("/smsTest")
    public String SMSSend(){
        User user = new User();
        user.setFName("Asanka");
        user.setLName("Lalith");
        user.setPhoneNumber("+94xxxxxxxxxx");
        //send sms
    twilioMessageService.sendSMS(user.getPhoneNumber(), user.getFName());
        return "Good Job";
    }
}

