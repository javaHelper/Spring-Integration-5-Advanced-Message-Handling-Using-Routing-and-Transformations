package com.example.springintegration.service;

import com.example.springintegration.config.RouterChannelGateway;
import com.example.springintegration.model.ReservationConfirmation;
import com.example.springintegration.model.ReservationRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    private static Logger logger = LogManager.getLogger(ReservationServiceImpl.class);

    @Autowired
    private RouterChannelGateway gateway;

    @Override
    public void addReservationRecord(String id, String name) {
        Message<String> reservationRecordMessage = gateway.routeMessage(
                MessageBuilder.withPayload(new ReservationRecord(id, name)).build());

        logger.info("Received result from reservation record message: {}", reservationRecordMessage.getPayload());
    }

    @Override
    public void completeReservation(String reservationId, String confirmationNumber) {
        ReservationConfirmation reservationConfirmation = new ReservationConfirmation(reservationId, confirmationNumber);

        Message<String> reservationConfirmationMessage = gateway.routeMessage(
                MessageBuilder.withPayload(reservationConfirmation).build());

        logger.info("Received result from reservation confirmation message: {}",
                reservationConfirmationMessage.getPayload());
    }
}