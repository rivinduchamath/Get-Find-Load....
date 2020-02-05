package lk.ijse.dep.entity;

import javax.persistence.*;


@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
   @Column(columnDefinition = "ENUM('MALE','FEMALE')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Employee(int id ,String name, Gender gender) {
        this.name = name;
        this.id =id;
        this.gender = gender;
    }

    public Employee(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee() {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
