public class ParkingRate {
    private ParkingSpotType spotType;
    private double ratePerHour;

    public ParkingRate(ParkingSpotType spotType, double ratePerHour) {
        this.spotType = spotType;
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
}
