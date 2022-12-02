package com.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void should_return_ticket_when_park_given_a_car() {
        // given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        // when
        Ticket ticket = parkingLot.park(car);
        // then
        assertNotNull(ticket);
    }
}
