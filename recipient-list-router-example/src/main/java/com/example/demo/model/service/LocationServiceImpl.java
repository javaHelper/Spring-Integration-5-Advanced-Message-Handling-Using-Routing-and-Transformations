package com.example.demo.model.service;

import com.example.demo.config.RouterChannelGateway;
import com.example.demo.model.LocationRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    private static final Logger logger = LogManager.getLogger(LocationServiceImpl.class);

    @Autowired
    private RouterChannelGateway routerChannelGateway;

    @Override
    public void saveLocation(String gpsLocation, String customerId) {
        logger.info("** Saving location for customer {}: {}", customerId, gpsLocation);
        Message<LocationRecord> message = MessageBuilder
                .withPayload(new LocationRecord(customerId, gpsLocation))
                .build();
        routerChannelGateway.routeMessage(message);
    }
}