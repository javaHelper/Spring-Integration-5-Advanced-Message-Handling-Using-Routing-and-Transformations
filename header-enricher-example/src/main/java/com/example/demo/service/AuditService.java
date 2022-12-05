package com.example.demo.service;

import com.example.demo.model.PartyReservation;
import org.springframework.messaging.Message;

public interface AuditService {
    void handlePartyReservation(Message<PartyReservation> partyReservationMessage);
}