package com.example.demo.config;

import com.example.demo.model.PartyReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "auditChannelGateway", defaultRequestChannel = "headerEnricherRemoveAuthChannel")
public interface AuditChannelGateway {
    @Gateway
    void publishPartyReservation(Message<PartyReservation> partyReservation);
}