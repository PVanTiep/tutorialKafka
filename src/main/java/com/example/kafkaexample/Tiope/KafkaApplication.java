package com.example.kafkaexample.Tiope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate) {
//        return args -> kafkaTemplate.send("myTopic", new Message("Hello World", LocalDateTime.now()));
//    }
}
