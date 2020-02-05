package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Actor;
import lk.ijse.dep.hibernate.entity.Movie;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ManyToMany2 {

    public static void main(String[] args) {

        try ( SessionFactory sf = HibernateUtil.getSessionFactory();
              Session session = sf.openSession()) {

            session.beginTransaction();

            session.getTransaction().commit();

        }

    }

}
