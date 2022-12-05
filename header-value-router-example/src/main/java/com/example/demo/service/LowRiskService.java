package com.example.demo.service;

import com.example.demo.model.SupportTicket;
import org.springframework.messaging.Message;

public interface LowRiskService {
    void handleSupportTicket(Message<SupportTicket> supportTicketMessage);
}