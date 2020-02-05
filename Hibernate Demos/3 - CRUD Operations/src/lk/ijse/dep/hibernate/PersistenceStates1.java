package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class PersistenceStates1 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer customer1 = session.get(Customer.class, "C001");

        Customer customer2 = session.get(Customer.class, "C001");

        System.out.println(customer1 == customer2);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
