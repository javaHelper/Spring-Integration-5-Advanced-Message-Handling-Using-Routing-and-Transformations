package com.example.demo.config;

import com.example.demo.model.SupportTicket;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "routerChannelGateway", defaultRequestChannel = "routerChannel")
public interface RouterChannelGateway {
    @Gateway
    void routeMessage(Message<SupportTicket> message);
}