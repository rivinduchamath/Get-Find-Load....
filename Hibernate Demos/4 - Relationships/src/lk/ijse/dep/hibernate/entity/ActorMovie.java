package lk.ijse.dep.hibernate.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "actor_movie_2")
public class ActorMovie {

    @EmbeddedId
    private ActorMoviePK actorMoviePK;
    @Column(name = "joined_date")
    private Date joinedDate;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @JoinColumn(name = "actor_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Actor2 actor;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @JoinColumn(name = "movie_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Movie2 movie;

    public ActorMovie() {
    }

    public ActorMovie(ActorMoviePK actorMoviePK, Date joinedDate) {
        this.actorMoviePK = actorMoviePK;
        this.joinedDate = joinedDate;
    }

    public ActorMovie(String actorId, String movieId, Date joinedDate) {
        this.actorMoviePK = new ActorMoviePK(actorId, movieId);
        this.joinedDate = joinedDate;
    }

    public ActorMoviePK getActorMoviePK() {
        return actorMoviePK;
    }

    public void setActorMoviePK(ActorMoviePK actorMoviePK) {
        this.actorMoviePK = actorMoviePK;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Actor2 getActor() {
        return actor;
    }

    public void setActor(Actor2 actor) {
        this.actor = actor;
    }

    public Movie2 getMovie() {
        return movie;
    }

    public void setMovie(Movie2 movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "ActorMovie{" +
                "actorMoviePK=" + actorMoviePK +
                ", joinedDate=" + joinedDate +
                ", actor=" + actor +
                ", movie=" + movie +
                '}';
    }
}
