package lk.ijse.dep.entity;

import javax.persistence.*;


@Entity
public class Customer2 {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private int id;

    @AttributeOverride(name = "name",column =  @Column(name = "customer_name"))
    @AttributeOverride(name = "contact_number",column =  @Column(name = "customer_contact"))
    @Embedded
    private PersonDetails personDetails;

    public Customer2(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public Customer2(int id ,PersonDetails personDetails) {
        this.id =id;
        this.personDetails = personDetails;
    }


    public Customer2(int id,String name, String houseNo, String street, String city, String contact_number) {
        this.id =id;
        this.personDetails = new PersonDetails(name,houseNo,street,city,contact_number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "id=" + id +
                ", personDetails=" + personDetails +
                '}';
    }
}
