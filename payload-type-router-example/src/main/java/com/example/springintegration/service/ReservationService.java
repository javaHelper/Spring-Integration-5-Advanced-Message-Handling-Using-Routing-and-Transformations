package com.example.springintegration.service;

public interface ReservationService {
    void addReservationRecord(String id, String name);
    void completeReservation(String reservationId, String confirmationNumber);
}