package com.parkinglot.v3;

import lombok.Getter;

@Getter
public class ParkingSpot {
    private int parkingSpotId;
    private SpotType spotType;
    private boolean isOccupied;
    public ParkingSpot(int parkingSpotId, SpotType spotType) {
        this.parkingSpotId = parkingSpotId;
        this.spotType = spotType;
        this.isOccupied = false;
    }
    public boolean canFit(Vehicle vehicle){
        switch (vehicle.getVehicleType()) {
            case BIKE:
                return spotType == SpotType.SMALL || spotType == SpotType.MEDIUM || spotType == SpotType.LARGE;
            case CAR:
                return spotType == SpotType.MEDIUM || spotType == SpotType.LARGE;
            case TRUCK:
                return spotType == SpotType.LARGE;
            default:
                return false;
        }
    }




    public boolean occupy() {
        if (!isOccupied) {
            isOccupied = true;
            return true;
        }
        return false;  // or throw exception
    }

    public boolean vacate() {
        if (isOccupied) {
            isOccupied = false;
            return true;
        }
        return false;
    }


}
