package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class RefreshDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer nuwan = new Customer("C002", "Ruwan", "Ragama", new Date());
//        session.refresh(nuwan);
////        System.out.println(nuwan);
////        nuwan.setName("Kaweesha++");

        Customer nuwan = session.get(Customer.class, "C002");
        nuwan.setName("Kaweesha");
        session.refresh(nuwan);

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
