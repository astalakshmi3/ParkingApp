package astalakshmi.example;

import jdk.jshell.Snippet;

import java.io.ObjectInputFilter;
import java.time.LocalDateTime;

public class Reservation {
    private final String reservationId;
    private final Customer customer;
    private final ParkingSpot parkingSpot;
    private final LocalDateTime startTime;
   private final LocalDateTime endTime;
    private Status status;
    public Reservation(String reservationId, Customer customer, ParkingSpot parkingSpot, LocalDateTime startTime, LocalDateTime endTime, Status status) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.parkingSpot = parkingSpot;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
    public Status getStatus() {
        return status;
    }

    public void completeReservation() {
        this.status = Status.COMPLETED;
    }
    public void cancelReservation() {
        this.status = Status.CANCELLED;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", customer=" + customer +
                ", parkingSpot=" + parkingSpot +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }
}
