package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class DirtyCheckingDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer leela = session.get(Customer.class, "C002");

        leela.setName("Heshan");

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
