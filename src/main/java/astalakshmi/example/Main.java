package astalakshmi.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            parkingSpots.add(new ParkingSpot("Spot" + i, 100 + i));
        }
        // Display all parking spots
         IO.println("\n Parking Lots - Area 101 to 110");
        IO.println("┌───────┬───────┬───────┬───────┬───────┐");
        for ( int i = 0; i < parkingSpots.size(); i++) {
            IO.print("│ " + parkingSpots.get(i).getSpotId() + " ");
            if ((i + 1) % 5 == 0) {
                IO.println("│");
                if (i + 1 < parkingSpots.size()) {
                    IO.println("├───────┼───────┼───────┼───────┼───────┤");
                }
            }
        }

            IO.println("└───────┴───────┴───────┴───────┴───────┘");

        List<Customer> customers = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();
        ParkingAppUI appUI = new ParkingAppUI(customers, parkingSpots, reservations);
        appUI.start();
    }
}

