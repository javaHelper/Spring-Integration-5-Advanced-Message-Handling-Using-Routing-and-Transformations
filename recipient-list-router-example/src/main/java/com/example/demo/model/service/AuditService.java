package com.example.demo.model.service;

import com.example.demo.model.LocationRecord;
import org.springframework.messaging.Message;

public interface AuditService {
    void handleLocationRecord(Message<LocationRecord> locationMessage);
}