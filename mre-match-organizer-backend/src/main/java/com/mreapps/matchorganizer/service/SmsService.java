package com.mreapps.matchorganizer.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SmsService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SmsService.class);

    @Value("twilio.account-sid")
    private String accountSid;

    @Value("twilio.auth-token")
    private String authToken;

    public void sendSms(String fromNumber, String toNumber, String text)
    {
        Twilio.init(accountSid, authToken);
        Message message = Message.creator(new PhoneNumber(toNumber), new PhoneNumber(fromNumber), text).create();
        System.out.println(message.getSid());
    }
}
