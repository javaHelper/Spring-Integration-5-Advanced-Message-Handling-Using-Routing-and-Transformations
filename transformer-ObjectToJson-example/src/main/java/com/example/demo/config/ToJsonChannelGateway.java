package com.example.demo.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "toJsonChannelGateway", defaultRequestChannel = "toJsonChannel")
public interface ToJsonChannelGateway {
    @Gateway
    void toJson(Object reservation);
}