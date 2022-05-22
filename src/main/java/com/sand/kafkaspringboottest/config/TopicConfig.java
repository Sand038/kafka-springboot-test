package com.sand.kafkaspringboottest.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

  @Bean
  public NewTopic valueUpdates() {
    return TopicBuilder.name("value_updates").build();
  }
}
