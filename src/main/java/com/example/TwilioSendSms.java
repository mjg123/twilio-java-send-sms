package com.example;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSendSms {

    public static void main(String[] args) {

        Twilio.init(
            System.getenv("TWILIO_ACCOUNT_SID"),
            System.getenv("TWILIO_AUTH_TOKEN"));

        Message.creator(
            new PhoneNumber("<TO number - ie your cellphone>"),
            new PhoneNumber("<FROM number - ie your Twilio number"),
            "Hello from Twilio 📞")
            .create();
    }
}
