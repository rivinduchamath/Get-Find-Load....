package lk.ijse.dep.entity;

import javax.persistence.*;



@Entity
public class Item {
    @TableGenerator(name = "dep1",
            table = "dep_seq",
            pkColumnName = "table_name",
            valueColumnName = "next_seq",
            pkColumnValue = "item",
            initialValue = 0,
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "dep1")
    @Id
    private int id;
    private String description;
    @Column(name = "qty_on_hand")
    private int qtyOnHand;
    @Column(name = "unit_price")
    private double unitePrice;

    public Item(int id, String description, int qtyOnHand, double unitePrice) {
        this.id = id;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitePrice = unitePrice;
    }
    public Item(String description, int qtyOnHand, double unitePrice) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", qtyOnHand='" + qtyOnHand + '\'' +
                ", unitePrice=" + unitePrice +
                '}';
    }
}
