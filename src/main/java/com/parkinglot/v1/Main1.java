package com.parkinglot.v1;

public class Main1 {
    public static void main(String[] args) {
        ParkingLot lot= new ParkingLot(3);
        int spot1= lot.park();
        int spot2= lot.park();
        int spot3= lot.park();
        lot.park();
        System.out.println("Available spots: " + lot.availableParkingSpots());
        lot.vacant(spot2);
        System.out.println("Available spots: " + lot.availableParkingSpots());
    }
}
