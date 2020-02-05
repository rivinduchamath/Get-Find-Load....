package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
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

//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }

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
