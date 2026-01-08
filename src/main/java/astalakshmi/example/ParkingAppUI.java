package astalakshmi.example;

import java.util.List;
import java.util.Scanner;

public class ParkingAppUI {
    private final List<Customer> customers;
    private final List<ParkingSpot> parkingSpots;
    private final List<Reservation> reservations;
    Scanner sc = new Scanner(System.in);

    public ParkingAppUI(List<Customer> customers, List<ParkingSpot> parkingSpots, List<Reservation> reservations) {
        this.parkingSpots = parkingSpots;
        this.reservations = reservations;
        this.customers = customers;
    }

        public void start () {
            System.out.println("Welcome to the Parking Reservation System!");
            // Further UI implementation can be added here
            while (true) {
                System.out.println("1. Regiter Customer");
                System.out.println("2. Show Available Parking Spots");
                System.out.println("3. Create Reservation");
                System.out.println("4. Complete Reservations (Chechout)");
                System.out.println("0. Exit");
                System.out.println("Please select an option:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        // Register Customer
                        System.out.println("Enter Customer ID:");
                        Integer id = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.println("Enter Customer Name:");
                        String name = sc.nextLine();
                        System.out.println("Enter Vehicle Plate Number:");
                        String plateNumber = sc.nextLine();
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.nextLine();
                        Customer customer = new Customer(id, name, plateNumber, phoneNumber);
                        customers.add(customer);
                        System.out.println("Customer registered successfully!");
                        break;
                    case 2:
                        // Show Available Parking Spots
                        viewParkingSpots();
                        break;
                    case 3:
                        // Create Reservation
                        // Further implementation can be added here
                        System.out.println("Create Reservation - Feature coming soon!");
                        break;
                    case 4:
                        // Complete Reservations
                        viewReservations();
                        break;
                    case 0:
                        System.out.println("Exiting the system. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

    private void viewReservations() {
        System.out.println("Current Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    private void viewParkingSpots() {
        System.out.println("Available Parking Spots:");
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.getIsOccupied()) {
                System.out.println(spot);
            }
        }

    }
}