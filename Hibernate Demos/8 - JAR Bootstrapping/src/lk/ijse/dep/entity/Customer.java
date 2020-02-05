package lk.ijse.dep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private  String name;



    public Customer(String name) {
        this.name = name;
    }

    public Customer(){}

    public Customer(int id,String name) {
        this.name = name;
        this.id= id;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
