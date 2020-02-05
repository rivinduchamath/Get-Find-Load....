package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(name = "query1",
query = "SELECT c FROM Customer c")

@NamedQuery(name = "query2",
        query = "SELECT c FROM Customer c WHERE c.id= ?1")


@Entity
public class Customer {

    @Id
//    @Column(name = "")
    private String id;
    private String name;
    private String address;

    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    public Customer() {
    }

    public Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public List<Order> getOrders() {
        return orders;
    }

    public void removeOrder(Order orders) {
        if (orders.getCustomer() != this){
            throw new RuntimeException("Invalid order");
        }
        orders.setCustomer(null);
        this.getOrders().remove(orders);
    }

    // Handler method
    public void addOrder(Order order) {
        order.setCustomer(this);
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
