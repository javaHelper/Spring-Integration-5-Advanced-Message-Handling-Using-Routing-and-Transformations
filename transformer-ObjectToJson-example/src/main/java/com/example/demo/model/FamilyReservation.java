package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FamilyReservation {
    private Integer familyId;
    private String name;
    private String roomType;
    private int numberOfChildren;
}