package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
@Entity
@Table(name = "orderDetail")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailPK orderDetailPK;
    @ManyToOne
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.MERGE})
    @JoinColumn(name = "orderId", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;
    @ManyToOne
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.MERGE})
    @JoinColumn(name = "itemId", referencedColumnName = "id", insertable = false, updatable = false)
    private Item item;

    private double unitePrice;
    private int qty;
    public OrderDetail(){}

    public OrderDetail(OrderDetailPK orderDetailPK, double unitePrice, int qty) {
        this.orderDetailPK = orderDetailPK;
        this.unitePrice = unitePrice;
        this.qty = qty;
    }

    public OrderDetail(String orderId,String itemId, double unitePrice, int qty) {
        this.orderDetailPK = new OrderDetailPK(orderId, itemId);
        this.unitePrice = unitePrice;
        this.qty = qty;
    }


    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }


    public Item getItem() {
        return item;
    }

    //Only for cascade operation
    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    //Only for cascade operation
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailPK=" + orderDetailPK +
                ", order=" + order +
                ", item=" + item +
                ", unitePrice=" + unitePrice +
                ", qty=" + qty +
                '}';
    }

}
