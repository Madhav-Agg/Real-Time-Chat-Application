package com.livechat.app.WebConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//Web socket provides a continous 2 way channel between two devices

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080") // only this origin req allowed also gives security
                .withSockJS();//sockJs is like an alternative for
                              // people whose system does not support web sockets
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //setting message broker
        registry.enableSimpleBroker("/topic");
        //when to expect a message
        registry.setApplicationDestinationPrefixes("/app");
    }
}
