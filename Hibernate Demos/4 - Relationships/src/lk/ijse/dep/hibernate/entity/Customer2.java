package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer2 {

    @Id
    private String id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST)
    private List<Order2> orders= new ArrayList<>();

    public Customer2() {
    }

    public Customer2(String id, String name, String address) {
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

    public List<Order2> getOrders() {
        return orders;
    }

    public void addOrder(Order2 order){
        order.setCustomer(this);
        getOrders().add(order);
    }

    public void removeOrder(Order2 order){
        if (order.getCustomer() != this){
            throw new RuntimeException("Invalid order");
        }
        order.setCustomer(null);
        this.getOrders().remove(order);
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
