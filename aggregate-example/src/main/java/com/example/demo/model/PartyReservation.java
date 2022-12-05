package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PartyReservation {
    private Integer partyId;
    private String roomType;
    private String name;
    private String confirmationNumber;

    public PartyReservation(Integer partyId, String roomType, String name) {
        this.partyId = partyId;
        this.roomType = roomType;
        this.name = name;
    }
}