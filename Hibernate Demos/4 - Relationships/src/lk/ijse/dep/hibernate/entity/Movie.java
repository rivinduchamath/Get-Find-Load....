package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    private String id;
    private String name;
    private String duration;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "actor_movie",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"))
    private List<Actor> actors = new ArrayList<>();

    public Movie() {
    }

    public Movie(String id, String name, String duration) {
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

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
