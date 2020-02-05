package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class ContainsDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        // new state
        Customer dilini = new Customer("C005", "Dilini", "Galle", new Date());

        System.out.println(session.contains(dilini));   // False
        session.save(dilini);
        System.out.println(session.contains(dilini)); // true
        session.remove(dilini);
        System.out.println(session.contains(dilini)); // false
        session.persist(dilini);
        System.out.println(session.contains(dilini));   // true
        session.detach(dilini); // detached state
        System.out.println(session.contains(dilini));   // false
        session.update(dilini);   // we can't use merge here
        System.out.println(session.contains(dilini));   // true

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
