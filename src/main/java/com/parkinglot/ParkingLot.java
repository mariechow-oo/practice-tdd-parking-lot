package com.parkinglot;

import java.util.HashMap;

public class ParkingLot {
    private HashMap<Ticket, Car> parkedPosition = new HashMap<>();
    public Ticket park(Car car) {
        Ticket ticket = new Ticket();
        parkedPosition.put(ticket, car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        return parkedPosition.get(ticket);
    }
}