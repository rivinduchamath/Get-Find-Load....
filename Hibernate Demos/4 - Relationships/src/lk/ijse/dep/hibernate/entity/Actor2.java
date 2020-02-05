package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor2 {

    @Id
    private String id;
    @Column(length = 55)
    private String name;
    private int age;
    @OneToMany(mappedBy = "actor")
    private List<ActorMovie> actorMovies = new ArrayList<>();

    public Actor2() {
    }

    public Actor2(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<ActorMovie> getActorMovies() {
        return actorMovies;
    }

//    public void setActorMovies(List<ActorMovie> actorMovies) {
//        this.actorMovies = actorMovies;

//    }

    @Override
    public String toString() {
        return "Actor2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
