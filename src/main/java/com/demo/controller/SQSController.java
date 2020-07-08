package com.demo.controller;

import com.demo.model.TestData;
import com.demo.service.SQSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqs")
public class SQSController {

    @Autowired
    SQSService sqsService;

    @PostMapping
    public void sendMessage(@RequestBody TestData testData) throws Exception {
        sqsService.send("maryanns-queue", testData);
    };

}
