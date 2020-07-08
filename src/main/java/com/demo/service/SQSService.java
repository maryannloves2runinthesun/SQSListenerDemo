package com.demo.service;

import com.demo.model.TestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SQSService {

    @Autowired
    QueueMessagingTemplate messagingTemplate;

    public void send(String topicName, TestData message) {
        messagingTemplate.convertAndSend(topicName, message);
    }

    @SqsListener(value = "${aws.queue.name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void queueListener(TestData message) throws Exception {

        System.out.println("Message: " + message.toString());

    }

}
