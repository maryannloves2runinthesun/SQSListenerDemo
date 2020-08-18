package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SQSListenerDemoApplication {

//    @Bean
//    public QueueMessagingTemplate queueMessagingTemplate(
//            AmazonSQSAsync amazonSQSAsync) {
//        return new QueueMessagingTemplate(amazonSQSAsync);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SQSListenerDemoApplication.class, args);
    }

}
