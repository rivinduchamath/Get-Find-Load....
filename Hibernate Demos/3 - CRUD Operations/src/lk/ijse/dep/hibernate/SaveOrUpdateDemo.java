package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class SaveOrUpdateDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer customer = new Customer("C004", "Kasba++", "Mathugama", new Date());
        Customer customer2 = session.load(Customer.class, "C002");
//        session.evict(customer2);
//        session.update(customer2);
//        System.out.println(customer2);
        //System.out.println(customer2);
        //session.saveOrUpdate(customer);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
