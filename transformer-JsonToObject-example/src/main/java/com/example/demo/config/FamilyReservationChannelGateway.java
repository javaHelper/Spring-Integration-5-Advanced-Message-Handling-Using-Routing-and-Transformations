package com.example.demo.config;

import com.example.demo.model.FamilyReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "familyReservationChannelGateway", defaultRequestChannel = "familyReservationChannel")
public interface FamilyReservationChannelGateway {
    @Gateway
    void publishFamilyReservation(FamilyReservation familyReservation);
}