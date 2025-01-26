public abstract class Vehicle {

    private String licensePlate;
    private ParkingSpotType spot;

    public Vehicle(String licensePlate, ParkingSpotType spot) {
        this.licensePlate = licensePlate;
        this.spot = spot;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public ParkingSpotType GetParkingSpot() {

        return spot;
    }

}
