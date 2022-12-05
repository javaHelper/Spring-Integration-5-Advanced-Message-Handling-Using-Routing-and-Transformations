package com.example.demo.service;

import com.example.demo.model.Address;
import org.springframework.messaging.Message;

public interface PartyRetrievalService {
    Address getPartyAddress(String partyId);
}