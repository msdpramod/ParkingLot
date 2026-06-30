package com.parkinglot.v4;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    public Floor(int floorNumber, int smallSpots, int mediumSpots, int largeSpots){
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
        int id=0;

        for(int i = 0; i < smallSpots; i++){
            parkingSpots.add(new ParkingSpot(id++, SpotType.SMALL));
        }
        for(int i = 0; i < mediumSpots; i++){
            parkingSpots.add(new ParkingSpot(id++, SpotType.MEDIUM));
        }
        for(int i = 0; i < largeSpots; i++){
            parkingSpots.add(new ParkingSpot(id++, SpotType.LARGE));
        }

    }

   public ParkingSpot findAvailableParkingSpot(Vehicle vehicle){
        for(ParkingSpot parkingSpot : parkingSpots){
            if(!parkingSpot.isOccupied() && parkingSpot.canFit(vehicle)){
                return parkingSpot;
            }
        }
        return null;
   }
    public boolean freeSpot(ParkingSpot parkingSpot){
        for(ParkingSpot parkingSpot1 : parkingSpots){
            if(parkingSpot1.getParkingSpotId() == parkingSpot.getParkingSpotId()){
                parkingSpots.remove(parkingSpot1);
                return true;
            }
        }

        return false;
    }
    public boolean freeParkingSpot(int parkingSpot){
        for(ParkingSpot parkingSpot1 : parkingSpots){
            if(!parkingSpot1.isOccupied() && parkingSpot1.getParkingSpotId() == parkingSpot){
                parkingSpots.remove(parkingSpot1);
                return true;

            }
        }
        return false;
    }

    public int availableParkingSpots(SpotType spotType){
        int count = 0;
        for(ParkingSpot parkingSpot1 : parkingSpots){
            if(!parkingSpot1.isOccupied() && parkingSpot1.getSpotType() == spotType){
                count++;
            }
        }
        return count;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
