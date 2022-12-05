package com.example.springintegration.service;

import com.example.springintegration.model.ReservationRecord;
import org.springframework.messaging.Message;

public interface ReservationRecordService {
    Message<String> processReservationRecord(Message<ReservationRecord> reservationRecordMessage);
}