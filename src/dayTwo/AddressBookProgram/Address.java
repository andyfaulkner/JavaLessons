package dayTwo.AddressBookProgram;

/**
 * Created by student on 28-Jun-16.
 */
public class Address {
    private String street;
    private String city;
    private String country;
    private String postcode;

    public Address(String street, String city, String country, String postcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }
}
