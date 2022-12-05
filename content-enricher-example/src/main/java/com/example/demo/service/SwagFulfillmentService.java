package com.example.demo.service;

import com.example.demo.model.PartyReservation;
import org.springframework.messaging.Message;

public interface SwagFulfillmentService {
    void fulfillSwag(PartyReservation partyReservation);
}