package com.example.parkinglot.Repositories;

import com.example.parkinglot.Models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {

    Map<Long, Ticket> tickets = new TreeMap<>();
    private long lastSavedId = 0L;

    public Ticket save(Ticket ticket) {
            lastSavedId++;
            ticket.setId(lastSavedId); // 0 +1 =1
            tickets.put(lastSavedId, ticket); //1 , ticket
            return ticket;//jhgjg
    }
}

