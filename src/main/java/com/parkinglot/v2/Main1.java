package com.parkinglot.v2;

public class Main1 {
    public static void main(String[] args) {
        ParkingLot lot= new ParkingLot(3);

        Vehicle bike= new Vehicle("ABC123", VehicleType.BIKE);
        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        Vehicle truck = new Vehicle("ABC123", VehicleType.TRUCK);

        lot.park( bike);
        lot.park(car);
        lot.park(truck);
    }
}
