package com.example.demo.service;

import com.example.demo.model.GroupReservation;

public interface ReservationService {
    void bookGroupReservation(GroupReservation groupReservation);
    void handleCompletedGroupReservation(GroupReservation groupReservation);
}