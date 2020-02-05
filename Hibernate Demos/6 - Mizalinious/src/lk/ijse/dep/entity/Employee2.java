package lk.ijse.dep.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Employee2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Date joinedDate;
    @AttributeOverride(name = "name",column =  @Column(name = "employee_name"))
    @AttributeOverride(name = "contact_number",column =  @Column(name = "employee_contact"))
    @Embedded
    private PersonDetails personDetails;



    public Employee2(Date joinedDate, PersonDetails personDetails) {
        this.joinedDate = joinedDate;
        this.personDetails = personDetails;
    }

    public Employee2(int id ,Date joinedDate,PersonDetails personDetails) {
        this.id =id;
        this.joinedDate =joinedDate;
        this.personDetails = personDetails;
    }

    public Employee2(int id, String name, String houseNo, String street, String city, String contact_number, Date joinedDate) {
        this.personDetails = new PersonDetails(name,houseNo,street,city,contact_number);
        this.id = id;
        this.joinedDate = joinedDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }
    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", joinedDate=" + joinedDate +
                ", personDetails=" + personDetails +
                '}';
    }
}
