package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EgarVsLazyDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer alisa = session.load(Customer.class, "C001");
        Customer alisa = session.getReference(Customer.class, "C002");
//        Customer alisa = session.get(Customer.class, "C001");
        System.out.println("=========================");

        System.out.println(alisa.getName());

//        session.delete(alisa);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
