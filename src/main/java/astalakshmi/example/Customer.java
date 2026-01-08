package astalakshmi.example;

import java.util.Objects;

public class Customer {
    private Integer id;
    private String name;
    private String vehiclePlateNumber;
    private String phoneNumber;

    public Customer(Integer id, String name, String vehiclePlateNumber, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.phoneNumber = phoneNumber;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Objects.requireNonNull("ID cannot be null");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       Objects.requireNonNull("Name cannot be null");
        this.name = name;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        // You can add validation for vehicle plate number format if needed
        Objects.requireNonNull("Vehicle Plate Number cannot be null");
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
       Objects.requireNonNull("Phone Number cannot be null");
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
