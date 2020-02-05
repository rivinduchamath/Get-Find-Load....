package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Order2 {

    @Id
    private String id;
    private Date date;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinTable(name = "customer_order",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"))
    private Customer2 customer;

    public Order2() {
    }

    public Order2(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer2 customer) {
        this.customer = customer;
    }
}
