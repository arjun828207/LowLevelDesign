import java.util.ArrayList;
import java.util.List;

public class BikeRentalService {

    private static BikeRentalService instace;

    private List<Bike> bikes;
    private List<Customer> customers;

    private BikeRentalService() {
        this.bikes = new ArrayList<Bike>();
        this.customers = new ArrayList<Customer>();
    }

    public synchronized static BikeRentalService getInstance() {

        if (instace == null) {
            instace = new BikeRentalService();
        }

        return instace;
    }

    public void AddBike(Bike bike) {
        bikes.add(bike);
    }

    public void RegisterCustomer(Customer customer) {
        customers.add(customer);
    }

}
