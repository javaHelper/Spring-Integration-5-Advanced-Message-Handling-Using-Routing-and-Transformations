package com.example.demo.config;

import com.example.demo.model.GroupReservation;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "groupReservationChannelGateway", defaultRequestChannel = "groupReservationChannel")
public interface GroupReservationChannelGateway {
    @Gateway
    void publishGroupReservation(Message<GroupReservation> message);
}