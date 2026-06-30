package com.parkinglot.v4;


public class Main1 {
    public static void main(String[] args) {
        ParkingLot parkingLot= new ParkingLot("Wheels Park");
        parkingLot.addFloor(new Floor(1, 2, 2, 1)); // Floor 1: 2 small, 2 medium, 1 large

        Vehicle bike = new Vehicle("BIKE123", VehicleType.BIKE);
        Vehicle car = new Vehicle("CAR456", VehicleType.CAR);
        Vehicle truck = new Vehicle("TRUCK789", VehicleType.TRUCK);

        System.out.println(parkingLot.park(bike)); // Should succeed
        System.out.println(parkingLot.park(car)); // Should succeed
        System.out.println(parkingLot.park(truck)); // Should succeed

        System.out.println(parkingLot.park(new Vehicle("CAR999", VehicleType.CAR))); // Should fail (no more medium spots)

        System.out.println(parkingLot.vacate(1)); // Should succeed
        System.out.println(parkingLot.park(new Vehicle("CAR999", VehicleType.CAR))); // Should now succeed


    }
}
