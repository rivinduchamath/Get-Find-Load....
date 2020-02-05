package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Actor;
import lk.ijse.dep.hibernate.entity.Movie;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ManyToMany {

    public static void main(String[] args) {

        try ( SessionFactory sf = HibernateUtil.getSessionFactory();
              Session session = sf.openSession()) {

            session.beginTransaction();

/*            Actor leela = new Actor("A001", "Leela", 24);
            Actor sulakkana = new Actor("A002", "Sulakkana", 27);
            Actor dilini = new Actor("A003", "Dilini", 27);
            Actor nadiya = new Actor("A004", "Nadiya", 22);

            Movie bahuboothayo = new Movie("M001", "Bahuboothayao", "2h");

            bahuboothayo.getActors().add(leela);
            bahuboothayo.getActors().add(sulakkana);
            bahuboothayo.getActors().add(dilini);
            bahuboothayo.getActors().add(nadiya);

            session.persist(bahuboothayo);*/

            //==============================================

            //Actor leela = session.get(Actor.class, "A001");
            //System.out.println(leela.getMovies().get(0));

            //==============================================

            Actor leela = new Actor("A001", "Leela", 24);

            Movie bahuboothayo = new Movie("M001", "Bahuboothayao", "2h");
            Movie ironman = new Movie("M002", "IronMan", "2h");

            /*
            bahuboothayo.getActors().add(leela);
            ironman.getActors().add(leela);

            leela.getMovies().add(bahuboothayo);
            leela.getMovies().add(ironman);
             */

            leela.addMovie(bahuboothayo);
            leela.addMovie(ironman);

            session.persist(leela);

            session.getTransaction().commit();

        }

    }

}
