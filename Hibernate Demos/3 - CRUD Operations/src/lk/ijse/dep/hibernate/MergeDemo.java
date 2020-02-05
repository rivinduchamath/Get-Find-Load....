package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class MergeDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer ashan = new Customer("C002", "Ruwan", "Kollupitiya", new Date());
        Customer clonedAshan = ashan;
        ashan = session.get(Customer.class, "C002");
        Customer clonedAsahn = (Customer) session.merge(clonedAshan);
        ashan.setName("Upul");
        session.evict(ashan);
        ashan = clonedAsahn;
        clonedAsahn.setAddress("Matara");
        ashan = (Customer) session.merge(ashan);
        ashan.setAddress("Nuwara eliya");

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
