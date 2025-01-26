public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        // Add a floor
        ParkingFloor floor = new ParkingFloor(3);
        floor.addSpot(new ParkingSpot(1, ParkingSpotType.Compact));
        floor.addSpot(new ParkingSpot(2, ParkingSpotType.Bike));
        parkingLot.addFloor(floor);

        // Park a car
        Vehicle car = new Bike("ABC-123");
        ParkingTicket ticket = parkingLot.parkVehicle(car);
        if (ticket != null) {
            System.out.println("Vehicle parked. Ticket ID: " + ticket.getTicketId());
        }

        // End parking session
        ticket.endParkingSession();
        ParkingRate rate = new ParkingRate(ParkingSpotType.Compact, 55.0);
        ticket.calculateCost(rate);
        System.out.println("Total cost: $" + ticket.getTotalCost());

        // Release the spot
        parkingLot.releaseSpot(ticket);
    }
}
