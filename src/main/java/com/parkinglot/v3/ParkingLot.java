package com.parkinglot.v3;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int smallSpots, int mediumSpots, int largeSpots) {
        parkingSpots = new ArrayList<>();
        //changes are made here
        int id=1;
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

    public int park( Vehicle vehicle){
        for(ParkingSpot parkingSpot : parkingSpots){
            // we are also checking  if it can fit in the spot or not

            if(!parkingSpot.isOccupied() && parkingSpot.canFit(vehicle)){
                parkingSpot.occupy();
                System.out.println( vehicle+ " is occupied now"+parkingSpot.getParkingSpotId());
                return parkingSpot.getParkingSpotId();
            }
        }
        System.out.println("Parking Lot is full"+parkingSpots);
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

    public int availableParkingSpots(SpotType spotType){
        int count = 0;
        for(ParkingSpot parkingSpot : parkingSpots){
            if(!parkingSpot.isOccupied() && spotType.equals(parkingSpot.getSpotType())){
                count++;
            }
        }
        return count;

    }
}
