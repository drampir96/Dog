package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.listener.model.KafkaBody;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "channel2", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "channel2", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(KafkaBody kafkaBody) {
        System.out.println("Consumed JSON Message: " + kafkaBody);
    }
}
