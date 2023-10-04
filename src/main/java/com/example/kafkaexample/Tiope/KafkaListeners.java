package com.example.kafkaexample.Tiope;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "myTopic", groupId = "myGroup", containerFactory = "kafkaListenerContainerFactory")
    void listener(Message data) {
        System.out.println("Listener received: " + data + "😁");
    }

}
