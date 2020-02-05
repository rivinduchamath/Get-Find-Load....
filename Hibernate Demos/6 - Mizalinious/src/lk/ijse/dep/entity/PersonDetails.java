package lk.ijse.dep.entity;

public class PersonDetails {
    private String name;
    private String houseNo;
    private String street ;
    private String city;
    private String contact_number;

    public PersonDetails(){

    }
    public PersonDetails(String name, String houseNo, String street, String city, String contact_number) {
        this.name = name;
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.contact_number = contact_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
}
