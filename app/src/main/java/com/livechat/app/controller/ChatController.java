
package com.livechat.app.controller;

import com.livechat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendmessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {

        System.out.println("MESSAGE RECEIVED: "
                + message.getSender() + " : "
                + message.getContent());

        return message;
    }
    @GetMapping("/")
    public String home() {
        return "redirect:/chat";
    }
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}