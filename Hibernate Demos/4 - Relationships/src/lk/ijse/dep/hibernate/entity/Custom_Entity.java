package lk.ijse.dep.hibernate.entity;

import java.util.Date;

public class Custom_Entity {

    private String orderID;
    private Date order_date;
    private String customer_ID;
    private String customer_name;
    private double total;
    public Custom_Entity(){}

    public Custom_Entity(String orderID, Date order_date, String customer_ID, String customer_name, double total) {
        this.orderID = orderID;
        this.order_date = order_date;
        this.customer_ID = customer_ID;
        this.customer_name = customer_name;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Custom_Entity{" +
                "orderID='" + orderID + '\'' +
                ", order_date=" + order_date +
                ", customer_ID='" + customer_ID + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", total=" + total +
                '}';
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
