package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    private String id;
    private String name;
    private String address;
    @OneToOne(mappedBy = "person", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Pet pet;

    public Person() {
    }

    public Person(String id, String name, String address) {
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

    public Pet getPet() {
        return pet;
    }

    // Handler method
    public void setPet(Pet pet) {
        if (pet == null){
            this.getPet().setPerson(null);
            this.pet = null;
            return;
        }
        pet.setPerson(this);
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
