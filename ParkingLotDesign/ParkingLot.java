import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors;

    private ParkingLot() {
        this.floors = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicle.GetParkingSpot());
            if (spot != null) {
                spot.setIsAvailable(false);
                return new ParkingTicket(floors.size() + 1, vehicle.getLicensePlate(), spot.getSpotId());
            }
        }
        System.out.println("No available spot for vehicle: " + vehicle.getLicensePlate());
        return null;
    }

    public void releaseSpot(ParkingTicket ticket) {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.spots) {
                if (spot.getSpotId() == ticket.getSpotId()) {
                    spot.setIsAvailable(true);
                }
            }
        }
    }
}
