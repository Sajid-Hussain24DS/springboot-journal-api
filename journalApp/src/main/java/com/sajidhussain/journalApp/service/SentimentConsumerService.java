package com.sajidhussain.journalApp.service;


import com.sajidhussain.journalApp.model.SentimentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentimentConsumerService {

    @Autowired
    private EmailService emailService;

    // Redis listener yaha call karega
    public void consume(SentimentData sentimentData) {
        sendEmail(sentimentData);
    }

    private void sendEmail(SentimentData sentimentData) {
        emailService.sendEmail(
                sentimentData.getEmail(),
                "Sentiment for previous week",
                sentimentData.getSentiment()
        );
    }
}