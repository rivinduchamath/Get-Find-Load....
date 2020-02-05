package lk.ijse.dep.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ActorMoviePK implements Serializable {

    @Column(name = "actor_id")
    private String actorId;
    @Column(name = "movie_id")
    private String movieId;

    public ActorMoviePK() {
    }

    public ActorMoviePK(String actorId, String movieId) {
        this.actorId = actorId;
        this.movieId = movieId;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "ActorMoviePK{" +
                "actorId='" + actorId + '\'' +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}
