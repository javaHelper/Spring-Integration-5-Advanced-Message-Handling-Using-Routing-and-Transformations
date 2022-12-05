package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartyReservation {
    private Integer partyId;
    private String roomType;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    public PartyReservation(Integer partyId, String roomType, String name) {
        this.partyId = partyId;
        this.roomType = roomType;
        this.name = name;
    }
}