package com.example.demo.service;

import com.example.demo.model.PartyReservation;
import org.springframework.messaging.Message;

public interface PartyReservationService {
    void handlePartyReservation(Message<PartyReservation> partyReservationMessage);
}