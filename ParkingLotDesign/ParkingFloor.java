import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorId;
    public List<ParkingSpot> spots;

    public ParkingFloor(int floorId) {
        this.floorId = floorId;
        this.spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(ParkingSpotType type) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() && spot.getType() == type) {
                return spot;
            }
        }
        return null;
    }
}
