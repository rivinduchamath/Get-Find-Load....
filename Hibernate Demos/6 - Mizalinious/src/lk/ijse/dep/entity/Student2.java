package lk.ijse.dep.entity;

import javax.persistence.*;
import java.sql.Blob;


@Entity
public class Student2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private Blob profilePic;



    public Student2(String name, Blob profilePic) {
        this.name = name;
        this.profilePic = profilePic;
    }
    public Student2(int id , String name, Blob profilePic) {
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

    public Blob getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Blob profilePic) {
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
