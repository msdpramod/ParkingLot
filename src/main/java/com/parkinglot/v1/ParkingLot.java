package com.parkinglot.v1;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int totalSpots){
        parkingSpots = new ArrayList<>();
        for(int i = 0; i < totalSpots; i++){
            parkingSpots.add(new ParkingSpot(i));
        }
    }

    public int park(){
        for(ParkingSpot parkingSpot : parkingSpots){
            if(!parkingSpot.isOccupied()){
                parkingSpot.occupy();
                System.out.println(parkingSpot.getParkingSpotId() + " is occupied now");
                return parkingSpot.getParkingSpotId();
            }
        }
        System.out.println("Parking Lot is full");
        return -1;
    }

    public boolean vacant(int parkingSpotId){
        for(ParkingSpot parkingSpot : parkingSpots){
            if(parkingSpot.getParkingSpotId() == parkingSpotId){
                parkingSpot.vacate();
                System.out.println(parkingSpot.getParkingSpotId() + " is vacated");
                return true;
            }
        }
        System.out.println(parkingSpotId + "  No such parking spot exists");
        return false;
    }

    public int availableParkingSpots(){
        int count = 0;
        for(ParkingSpot parkingSpot : parkingSpots){
            if(!parkingSpot.isOccupied()){
                count++;
            }
        }
        return count;

    }
}
