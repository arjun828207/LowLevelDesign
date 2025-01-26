
public class Bike {
    private int BikeId;
    private TypeFactory.AvailableStatus status;
    private TypeFactory.BikeType type;
    private int RatePerHour;

    public Bike(int bikeId, TypeFactory.BikeType type, int ratePerHour) {
        BikeId = bikeId;
        this.status = TypeFactory.AvailableStatus.Booked;
        this.type = type;
        RatePerHour = ratePerHour;
    }

    public int getBikeId() {
        return BikeId;
    }

    public TypeFactory.AvailableStatus getStatus() {
        return status;
    }

    public void setStatus(TypeFactory.AvailableStatus status) {
        this.status = status;
    }

    public TypeFactory.BikeType getType() {
        return type;
    }

    public int getRatePerHour() {
        return RatePerHour;
    }

}
