package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class EvictVsDetachDemo2 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer heshan = session.get(Customer.class, "C002");

        session.evict(heshan);

        heshan.setAddress("New Zeland");

        System.out.println(heshan);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
