package lk.ijse.dep.entity;

import javax.persistence.*;
import java.util.Arrays;


@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private byte[] profilePic;


    public Student() {
    }

    public Student(String name, byte[] profilePic) {
        this.name = name;
        this.profilePic = profilePic;
    }
    public Student(int id , String name, byte[] profilePic) {
        this.id = id;
        this.name = name;
        this.profilePic = profilePic;
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

    public byte[] getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(byte[] profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
