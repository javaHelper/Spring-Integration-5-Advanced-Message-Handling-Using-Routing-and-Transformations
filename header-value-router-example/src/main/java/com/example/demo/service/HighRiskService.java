package com.example.demo.service;

import com.example.demo.model.SupportTicket;
import org.springframework.messaging.Message;

public interface HighRiskService {
    void handleSupportTicket(Message<SupportTicket> supportTicketMessage);
}