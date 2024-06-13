import com.zenika.findthesmells.smell3.Address;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String displayAddress() {
        return "Address of " + name + " is: " + address.getStreet() + ", " + address.getCity() + ", " + address.getPostalCode() + ", " + address.getCountry();
    }
}
