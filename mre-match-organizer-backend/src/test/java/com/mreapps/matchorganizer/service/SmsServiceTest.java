package com.mreapps.matchorganizer.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 *
 */
public class SmsServiceTest
{
    private SmsService smsService;

    @Before
    public void setup() throws Exception
    {
        smsService = new SmsService();

        ReflectionTestUtils.setField(smsService, "accountSid", "ACa676817c4de08abd6592a41c31a2e1eb");
        ReflectionTestUtils.setField(smsService, "authToken", "ae41d37ba555a4676f122b2562e01bd2");
    }

    @Test
    public void sendSms() throws Exception
    {
        smsService.sendSms("+15005550006", "+4795731327", "Just a unit test");
    }

}