package com.example.demo.config;

import com.example.demo.model.PartyReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "swagChannelGateway", defaultRequestChannel = "swagChannel")
public interface SwagChannelGateway {
    @Gateway
    void sendSwag(PartyReservation partyReservation);
}