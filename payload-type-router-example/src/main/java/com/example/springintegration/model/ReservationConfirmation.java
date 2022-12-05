package com.example.springintegration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservationConfirmation {
    private String reservationId;
    private String confirmationNumber;
}