import java.util.List;

public class Customer {

    private int customerId;
    private String name;
    private String contactDetails;
    private List<Rental> rentals;

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void AddRental(Rental rental) {
        rentals.add(rental);
    }

    public Customer(int id, String name, String contactDetails, List<Rental> rentals) {
        this.customerId = id;
        this.name = name;
        this.contactDetails = contactDetails;
        this.rentals = rentals;
    }

}
