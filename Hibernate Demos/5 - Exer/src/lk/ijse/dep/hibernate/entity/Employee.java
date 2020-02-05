package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private String id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_address")
    private String address;
    private String joinDate;

    public Employee() {
    }

    public Employee(String id, String name, String address, String joinDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.joinDate = joinDate;
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

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", joinDate='" + joinDate + '\'' +
                '}';
    }
}
