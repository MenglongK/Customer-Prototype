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
                "Phnom Penh",
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
        customer2.setCustomerId("C002");
        customer2.setFirstName("Sok");
        customer2.setLastName("Dara");
        customer2.setEmail("sok.dara@gmail.com");
        customer2.setPhoneNumber("097654321");
        customer2.setDateOfBirth("1998-04-12");
        customer2.setGender("Male");
        customer2.setAddress("Street 271");
        customer2.setCity("Phnom Penh");
        customer2.setState("Phnom Penh");
        customer2.setPostalCode("12000");
        customer2.setCountry("Cambodia");
        customer2.setStatus("Active");
        customer2.setCustomerType("Regular");

        Customer customer3 = (Customer) customer1.clone();
        customer3.setCustomerId("C003");
        customer3.setFirstName("Chan");
        customer3.setLastName("Sreyneang");
        customer3.setEmail("sreyneang.chan@gmail.com");
        customer3.setPhoneNumber("096778899");
        customer3.setDateOfBirth("2000-09-25");
        customer3.setGender("Female");
        customer3.setAddress("Street 360");
        customer3.setCity("Phnom Penh");
        customer3.setState("Phnom Penh");
        customer3.setPostalCode("12000");
        customer3.setCountry("Cambodia");
        customer3.setStatus("Active");
        customer3.setCustomerType("Regular");

        Customer customer4 = (Customer) customer1.clone();
        customer4.setCustomerId("C004");
        customer4.setFirstName("Vuthy");
        customer4.setLastName("Keo");
        customer4.setEmail("vuthy.keo@yahoo.com");
        customer4.setPhoneNumber("088334455");
        customer4.setDateOfBirth("1995-01-18");
        customer4.setGender("Male");
        customer4.setAddress("Street 1986");
        customer4.setCity("Phnom Penh");
        customer4.setState("Phnom Penh");
        customer4.setPostalCode("12000");
        customer4.setCountry("Cambodia");
        customer4.setStatus("Active");
        customer4.setCustomerType("Regular");

        Customer customer5 = (Customer) customer1.clone();
        customer5.setCustomerId("C005");
        customer5.setFirstName("Lina");
        customer5.setLastName("Phan");
        customer5.setEmail("lina.phan@gmail.com");
        customer5.setPhoneNumber("092556677");
        customer5.setDateOfBirth("2001-07-03");
        customer5.setGender("Female");
        customer5.setAddress("Street 51");
        customer5.setCity("Phnom Penh");
        customer5.setState("Phnom Penh");
        customer5.setPostalCode("12000");
        customer5.setCountry("Cambodia");
        customer5.setStatus("Active");
        customer5.setCustomerType("Regular");

        System.out.println("Customer1: " + customer1);
        System.out.println("Customer2: " + customer2);
        System.out.println("Customer3: " + customer3);
        System.out.println("Customer4: " + customer4);
        System.out.println("Customer5: " + customer5);
    }
}
