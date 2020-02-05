package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor {

    @Id
    private String id;
    @Column(length = 55)
    private String name;
    private int age;
    @ManyToMany(mappedBy = "actors", cascade = CascadeType.PERSIST)
    private List<Movie> movies = new ArrayList<>();

    public Actor() {
    }

    public Actor(String id, String name, int age) {
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

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movie.getActors().add(this);
        this.getMovies().add(movie);
    }
}
