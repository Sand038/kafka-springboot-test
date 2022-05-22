package com.sand.kafkaspringboottest.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "value_updates", groupId = "sand1")
  void listener(String data) {
    System.out.println("Listener received: " + data);
  }
}
