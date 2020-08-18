package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqs")
public class SQSController {

//    @Autowired
//    SQSService sqsService;

    @Value( "${aws.queue.name}" )
    private String awsQueueName;

//    @PostMapping
//    public void sendMessage(@RequestBody TestData testData) throws Exception {
//        sqsService.send( awsQueueName, testData);
//    };

}
