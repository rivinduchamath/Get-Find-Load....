package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie2 {

    @Id
    private String id;
    private String name;
    private String duration;

    public List<ActorMovie> getActorMovies() {
        return actorMovies;
    }

    @OneToMany(mappedBy = "movie")
    List<ActorMovie> actorMovies=new ArrayList<>();
    public Movie2() {
    }

    public Movie2(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +

                '}';
    }
}
