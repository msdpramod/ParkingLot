package com.parkinglot.v1;

import lombok.Getter;

@Getter
public class ParkingSpot {
    private int parkingSpotId;
    private boolean isOccupied;
    public ParkingSpot(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
        this.isOccupied = false;
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
