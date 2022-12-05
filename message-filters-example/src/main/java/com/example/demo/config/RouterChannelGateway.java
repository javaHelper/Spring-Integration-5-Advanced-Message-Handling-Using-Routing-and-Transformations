package com.example.demo.config;

import com.example.demo.model.PurchaseOrder;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "routerChannelGateway", defaultRequestChannel = "filterChannel")
public interface RouterChannelGateway {
    @Gateway
    void routeMessage(Message<PurchaseOrder> message);
}