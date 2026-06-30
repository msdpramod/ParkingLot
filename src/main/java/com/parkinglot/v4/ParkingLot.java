package com.parkinglot.v4;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String name;
    private List<Floor> floors;

    public ParkingLot(String name) {
        this.name= name;
        floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
        System.out.println("Added floor: " + floor);
    }
    public void removeFloor(Floor floor) {
        floors.remove(floor);
    }
    public int park(Vehicle vehicle) {
        for(Floor floor : floors) {
            ParkingSpot parkingSpot= floor.findAvailableParkingSpot(vehicle);
            if(parkingSpot != null) {
                parkingSpot.occupy();
                System.out.println(vehicle.getLicensePlate() + " is parked at spot: " + parkingSpot.getParkingSpotId() +
                        " on floor: " + floor.availableParkingSpots(parkingSpot.getSpotType()));
                return parkingSpot.getParkingSpotId();
            }
        }
        System.out.println("No available parking spot found.");
        return -1;
    }

    public boolean vacate(int parkingSpotId) {
        for(Floor floor : floors) {
            if(floor.freeParkingSpot(parkingSpotId)){
                System.out.println("Vacating parking spot: " + parkingSpotId);
                return true;
            }
        }
        System.out.println("No such parking spot exists.");
        return false;
    }
    public void printAvailableParkingSpots() {
        for(Floor floor : floors) {
            System.out.println(floor.getFloorNumber() + " -> SMALL: " + floor.availableParkingSpots(SpotType.SMALL));
            System.out.println(floor.getFloorNumber() + " -> MEDIUM: " + floor.availableParkingSpots(SpotType.MEDIUM));
            System.out.println(floor.getFloorNumber() + " -> LARGE: " + floor.availableParkingSpots(SpotType.LARGE));
        }
    }

}
