package com.sajidhussain.journalApp.Service;

import com.sajidhussain.journalApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEmail("lasharisajidhussain9@gmail.com", "Testing java mail sender", "Hi, Aap kese hai bhai jaan");
    }
}
