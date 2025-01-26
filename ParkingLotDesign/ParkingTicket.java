import java.time.LocalDateTime;

public class ParkingTicket {
    private int ticketId;
    private String vehicleLicensePlate;
    private int spotId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double totalCost;

    public ParkingTicket(int ticketId, String vehicleLicensePlate, int spotId) {
        this.ticketId = ticketId;
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.spotId = spotId;
        this.entryTime = LocalDateTime.now().minusHours(6);
    }

    public void endParkingSession() {
        this.exitTime = LocalDateTime.now();
    }

    public void calculateCost(ParkingRate rate) {
        long hours = java.time.Duration.between(entryTime, exitTime).toHours();
        this.totalCost = rate.getRatePerHour() * hours;
    }

    // Getters
    public double getTotalCost() {
        return totalCost;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getSpotId() {
        return spotId;
    }
}
