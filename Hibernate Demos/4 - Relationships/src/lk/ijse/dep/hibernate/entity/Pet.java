package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;

@Entity
public class Pet {

    @Id
    private String id;
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinTable(name = "person_pet",
            joinColumns = @JoinColumn(name = "pet_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(columnNames = "person_id"))
    private Person person;

    public Pet() {
    }

    public Pet(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
