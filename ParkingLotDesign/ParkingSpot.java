public class ParkingSpot {
    int spotId;
    private ParkingSpotType type;
    private boolean isAvailable;

    public ParkingSpot(int spotId, ParkingSpotType type) {
        this.spotId = spotId;
        this.type = type;
        isAvailable = true;
    }

    public int getSpotId() {
        return spotId;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
