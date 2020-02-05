package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;

@Entity
public class Spouse {

    @Id
    private String id;
    private String name;
    @Column(name = "contact_no")
    private String contactNumber;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id",nullable = false)
    private Employee employee;

    public Spouse() {
    }

    public Spouse(String id, String name, String contactNumber, Employee employee) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.employee = employee;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Spouse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", employeeId='" + employee + '\'' +
                '}';
    }
}
