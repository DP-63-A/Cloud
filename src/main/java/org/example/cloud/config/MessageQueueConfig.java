package org.example.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
public class MessageQueueConfig {

    @Bean
    public MessageChannel outputChannel() {
        return new DirectChannel();
    }
}
