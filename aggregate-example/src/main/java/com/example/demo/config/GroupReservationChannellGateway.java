package com.example.demo.config;

import com.example.demo.model.GroupReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "groupReservationChannelGateway", defaultRequestChannel = "groupReservationChannel")
public interface GroupReservationChannellGateway {
    @Gateway
    void publishGroupReservation(GroupReservation message);
}