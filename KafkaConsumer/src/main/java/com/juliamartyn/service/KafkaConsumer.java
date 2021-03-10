package com.juliamartyn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private static final String TOPIC = "topic1";

    @KafkaListener(topics = TOPIC, groupId = "group_id")
    public void messageListener(String message) {
        logger.info("Consumed message -> {}", message));
    }

}
