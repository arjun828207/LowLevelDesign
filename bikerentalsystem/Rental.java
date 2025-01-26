import java.time.LocalDateTime;

public class Rental {

    int rentalId;
    Customer customer;
    Bike bike;
    long totalCost;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Rental(int rentalId, Customer customer, Bike bike) {
        this.rentalId = rentalId;
        this.customer = customer;
        this.bike = bike;
        this.startTime = LocalDateTime.now();
        this.totalCost = 0;
    }

    public void EndRental() {
        this.endTime = LocalDateTime.now();
        long hours = java.time.Duration.between(startTime, endTime).toHours();
        this.totalCost = hours * bike.getRatePerHour();
        bike.setStatus(TypeFactory.AvailableStatus.Vacant);
    }

    public long getTotalCost() {
        return totalCost;
    }
}
