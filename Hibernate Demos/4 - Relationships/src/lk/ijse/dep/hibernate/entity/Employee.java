package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    private String id;
    private String name;
    private String address;
    @OneToOne(mappedBy = "employee", fetch = FetchType.EAGER)
    private Spouse spouse;

    public Employee() {
    }

    public Employee(String id, String name, String address) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

//    public Spouse getSpouse() {
//        return spouse;
//    }
//
    // Handler method, utility method
    public void setSpouse(Spouse spouse) {
        spouse.setEmployee(this);
        this.spouse = spouse;
    }
}
