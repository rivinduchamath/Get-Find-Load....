package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NamedNativeQuery(name = "query3",
query =  "SELECT  * FROM item")

@NamedNativeQuery(name = "query4",
        query =  "SELECT  * FROM item",resultClass = Item.class) // Only in JPQL
@Entity
public class Item {
    @Id
    private String id;
    private String description;
    @Column(name = "qtyOnHand")
    private String qtyOnHand;
    private double unitePrice;

    @OneToMany(mappedBy = "item",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Item(String id, String description, String qtyOnHand, double unitePrice) {
        this.id = id;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitePrice = unitePrice;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    public Item(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(String qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public void addOrderDetails(OrderDetail orderDetail){
        orderDetail.setItem(this);
        orderDetails.add(orderDetail);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", qtyOnHand='" + qtyOnHand + '\'' +
                '}';
    }
}
