package lk.ijse.dep.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable {

    @Column(name = "orderId")
    private String orderId;
    @Column(name = "itemId")
    private String itemId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(String orderId, String itemId) {
        this.orderId = orderId;
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

}

