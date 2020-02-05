package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class EvictVsDetachDemo1 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer alisa = new Customer("C001", "Alisa", "Pinwatte", new Date());

        session.save(alisa);

        session.detach(alisa);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
