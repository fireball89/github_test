package clouway.com.school;

/**
 * Created by Adelin ( adelin.ghanaem@clouway.com )
 */
public class Location {

    private String buildingNumber;
    private String streetNumber;
    private String city;
    private String country;
    private String postalCode;


    public Location(String buildingNumber, String streetNumber, String city, String country, String postalCode) {
        this.buildingNumber = buildingNumber;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }


    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
