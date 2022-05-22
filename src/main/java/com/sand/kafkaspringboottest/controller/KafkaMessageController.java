package com.sand.kafkaspringboottest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/v1.0/kafka-messages")
@RestController
public class KafkaMessageController {


  private final KafkaTemplate<String, String> kafkaTemplate;

  @PostMapping
  public ResponseEntity<String> sendMessage(@RequestBody String message) {
    kafkaTemplate.send("value_updates", message);
    return ResponseEntity.ok(message);
  }
}
