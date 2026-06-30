package com.parkinglot.v3;


public class Main1 {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10, 20, 5); // 10 small, 20 medium, 5 large spots

        Vehicle bike = new Vehicle("BIKE123", VehicleType.BIKE);
        Vehicle car = new Vehicle("CAR123", VehicleType.CAR);
        Vehicle truck = new Vehicle("TRUCK123", VehicleType.TRUCK);
        Vehicle truck2 = new Vehicle("TRUCK234", VehicleType.TRUCK);
        Vehicle car2 = new Vehicle("CAR234", VehicleType.CAR);

        int bikeSpot= parkingLot.park(bike);
        int carSpot = parkingLot.park(car);
        int truckSpot = parkingLot.park(truck);
        int truck2Spot = parkingLot.park(truck2);
        int car2Spot = parkingLot.park(car2);

        System.out.println("Available small spots: " + parkingLot.availableParkingSpots(SpotType.SMALL));
        System.out.println("Available medium spots: " + parkingLot.availableParkingSpots(SpotType.MEDIUM));
        System.out.println("Available large spots: " + parkingLot.availableParkingSpots(SpotType.LARGE));

        parkingLot.vacant(bikeSpot);
        parkingLot.vacant(carSpot);
        System.out.println("Available small spots: " + parkingLot.availableParkingSpots(SpotType.SMALL));
        System.out.println("Available medium spots: " + parkingLot.availableParkingSpots(SpotType.MEDIUM));
    }
}
