package com.example.springintegration.service;

import com.example.springintegration.model.ReservationConfirmation;
import org.springframework.messaging.Message;

public interface ReservationConfirmationService {
    Message<String> processString(Message<ReservationConfirmation> reservationConfirmationMessage);
}