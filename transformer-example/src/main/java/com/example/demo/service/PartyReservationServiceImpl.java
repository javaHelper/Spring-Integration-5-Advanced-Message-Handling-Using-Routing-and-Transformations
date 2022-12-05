package com.example.demo.service;

import com.example.demo.model.PartyReservation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class PartyReservationServiceImpl implements PartyReservationService {
    private static final Logger logger = LogManager.getLogger(PartyReservationServiceImpl.class);

    @ServiceActivator(inputChannel = "partyReservationChannel")
    @Override
    public void handlePartyReservation(Message<PartyReservation> partyReservationMessage) {
        PartyReservation partyReservation = partyReservationMessage.getPayload();
        logger.info("Book party reservation for {}: {}",
                partyReservation.getPartyId(), partyReservation.getName());
    }
}