package astalakshmi.example;

public class ParkingSpot {
 private final String spotId;
 private final Integer areaCode;
    private Boolean isOccupied;
    public ParkingSpot(String spotId, Integer areaCode) {
        this.spotId = spotId;
        this.areaCode = areaCode;
        this.isOccupied = false;
    }
    public String getSpotId() {
        return spotId;
    }
    public Integer getAreaCode() {
        return areaCode;
    }
    public Boolean getIsOccupied() {
        return isOccupied;
    }
    public void occupySpot() {
        this.isOccupied = true;
    }
    public void vacateSpot() {
        this.isOccupied = false;
    }
     @Override
     public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", areaCode=" + areaCode +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
