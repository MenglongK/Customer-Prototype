import lombok.Setter;

@Setter
public class Customer implements CustomerPrototype {
    private String customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String username;
    private String password;
    private String registrationDate;
    private String status;
    private String customerType;
    private int totalOrders;
    private double totalSpent;
    private String notes;

    public Customer(String customerId, String firstName, String lastName, String gender, String dateOfBirth, String email, String phoneNumber, String address, String city, String state, String postalCode, String country, String username, String password, String registrationDate, String status, String customerType, int totalOrders, double totalSpent, String notes) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
        this.status = status;
        this.customerType = customerType;
        this.totalOrders = totalOrders;
        this.totalSpent = totalSpent;
        this.notes = notes;
    }

    @Override
    public CustomerPrototype clone() {
        return new Customer(customerId, firstName, lastName, gender, dateOfBirth, email, phoneNumber, address, city, state, postalCode, country, username, password, registrationDate, status, customerType, totalOrders, totalSpent, notes);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", username='" + username + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", status='" + status + '\'' +
                ", customerType='" + customerType + '\'' +
                ", totalOrders=" + totalOrders +
                ", totalSpent=" + totalSpent +
                ", notes='" + notes + '\'' +
                '}';
    }
}
