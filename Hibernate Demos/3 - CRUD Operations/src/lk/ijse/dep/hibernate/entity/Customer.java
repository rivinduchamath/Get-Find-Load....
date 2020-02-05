package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name="contacted_date")
    private Date contactedDate;

    public Customer() {
    }

    public Customer(String id, String name, String address, Date contactedDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactedDate = contactedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getContactedDate() {
        return contactedDate;
    }

    public void setContactedDate(Date contactedDate) {
        this.contactedDate = contactedDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactedDate=" + contactedDate +
                '}';
    }
}
