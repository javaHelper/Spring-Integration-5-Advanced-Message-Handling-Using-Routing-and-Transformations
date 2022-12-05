package com.example.demo.service;

import com.example.demo.model.PartyReservation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class SwagFulfillmentServiceImpl implements SwagFulfillmentService {
    private static final Logger logger = LogManager.getLogger(SwagFulfillmentServiceImpl.class);

    @ServiceActivator(inputChannel = "swagFulfillmentServiceChannel")
    @Override
    public void fulfillSwag(PartyReservation partyReservation) {
        logger.info("Sending swag for partyId: {} to {}, {}, {}, {}",
                partyReservation.getPartyId(), partyReservation.getAddress(),
                partyReservation.getCity(), partyReservation.getState(), partyReservation.getZip());
    }
}