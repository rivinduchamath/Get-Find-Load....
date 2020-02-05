package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`Order`")
public class Order {
    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Id
    private String id;
    private Date date;

    @ManyToOne(cascade ={ CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name = "customer_order",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"))
    private Customer customer;

    @OneToMany(mappedBy = "order",cascade ={ CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<OrderDetail> orderDetails = new ArrayList<>();


    public Order(String id, Date date) {
        this.id = id;
        this.date = date;

    }
    public Order(){}

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public  void addOrderDetails(OrderDetail orderDetail){
        orderDetail.setOrder(this);
        this.orderDetails.add(orderDetail);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }
}
