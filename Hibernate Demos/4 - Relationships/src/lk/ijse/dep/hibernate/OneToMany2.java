package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer2;
import lk.ijse.dep.hibernate.entity.Order2;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;

public class OneToMany2 {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            /*
            Customer2 alisa = new Customer2("C001", "Alisa", "Pinwatte");
            Order2 od001 = new Order2("OD001", Date.valueOf("2019-10-01"));
            Order2 od002 = new Order2("OD002", Date.valueOf("2019-10-01"));
            Order2 od003 = new Order2("OD003", Date.valueOf("2019-10-01"));

            od001.setCustomer(alisa);
            od002.setCustomer(alisa);

            session.persist(od001);
            session.persist(od002);
            session.persist(od003);
             */

            //=================================================================

/*            Customer2 alisa = new Customer2("C001", "Alisa", "Pinwatte");
            Order2 od001 = new Order2("OD001", Date.valueOf("2019-10-01"));
            Order2 od002 = new Order2("OD002", Date.valueOf("2019-10-01"));

            alisa.addOrder(od001);
            alisa.addOrder(od002);

            session.persist(alisa);*/

/*            Customer2 leel = new Customer2("C002", "Leel", "Mathuagama");
            Order2 od003 = new Order2("OD003", Date.valueOf("2019-10-01"));

            leel.addOrder(od003);

            session.persist(leel);*/

            //=========================================

//            Order2 od003 = session.get(Order2.class, "OD003");
//            od003.setCustomer(null);

/*            Customer2 leel = session.get(Customer2.class, "C002");
            leel.getOrders().get(0).setCustomer(null);*/

            Customer2 leel = session.get(Customer2.class, "C002");
            Order2 od003 = session.load(Order2.class, "OD003");
            leel.removeOrder(od003);

            session.getTransaction().commit();
        }

    }
}
