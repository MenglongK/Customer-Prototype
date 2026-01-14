public class CustomerDemo {
    static void main(String[] args) {
        Customer customer1 = new Customer(
                "C001",
                "John",
                "Doe",
                "Male",
                "1998-05-12",
                "john.doe@gmail.com",
                "012345678",
                "Street 271",
                "Phnom Penh",
                "PP",
                "12000",
                "Cambodia",
                "johndoe",
                "123456",
                "2026-01-14",
                "Active",
                "Regular",
                5,
                250.75,
                "VIP customer"
        );
        Customer customer2 = (Customer) customer1.clone();
        System.out.println("Customer1: " + customer1);
    }
}
