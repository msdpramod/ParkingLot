package com.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class Ticket extends BaseModel{
    private ParkingSpot parkingSpot;
    private Date issuedAt;
    private Vehicle vehicle;
    private Gate gate;
    private Operator operator;

}
