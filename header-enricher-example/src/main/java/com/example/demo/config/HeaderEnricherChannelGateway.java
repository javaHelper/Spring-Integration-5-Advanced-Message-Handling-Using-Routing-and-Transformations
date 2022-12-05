package com.example.demo.config;

import com.example.demo.model.PartyReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "headerEnricherAddAuthChannelGateway", defaultRequestChannel = "headerEnricherAddAuthChannel")
public interface HeaderEnricherChannelGateway {
    @Gateway
    void publishPartyReservation(PartyReservation partyReservation);
}