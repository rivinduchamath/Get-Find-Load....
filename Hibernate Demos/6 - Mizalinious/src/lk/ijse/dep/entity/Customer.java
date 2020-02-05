package lk.ijse.dep.entity;

import javax.persistence.*;


@Entity
public class Customer {
//
//    @SequenceGenerator(
//            name = "my_sql1",
//            sequenceName = "newxt_val",
//            initialValue = 1,
//            allocationSize = 4
//    )
//
//    @SequenceGenerator(
//            name = "my_sql2",//Identify the genarator
//            sequenceName = "newxt_val", //New Table Name
//            initialValue = 1,
//            allocationSize = 2 //Increment Size
  //  )
    @TableGenerator(name = "dep1",
            table = "dep_seq",
            pkColumnName = "table_name",
            valueColumnName = "next_seq",
            pkColumnValue = "customer",
            initialValue = 0,
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "dep1")
    @Id
//    @Column(name = "")
    private int id;
    private String name;
    private String address;


    public Customer() {
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
