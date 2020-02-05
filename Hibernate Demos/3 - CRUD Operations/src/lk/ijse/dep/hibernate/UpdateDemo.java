package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Date;

public class UpdateDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Customer upul = session.get(Customer.class, "C002");
//        session.evict(upul);
//        session.update(upul);
//        upul.setName("Waduma");

//        Customer sasindu = new Customer("C002", "Sasindu", "Panadura", new Date());
//        session.update(sasindu);

        Customer punchiya = new Customer("C005", "Niran", "Borella", new Date());
        Customer punchiyaCloned = session.find(Customer.class, "C003");
        session.update(punchiya);

//        punchiya.setAddress("Api borellea");
//        session.update(punchiya);

//        Customer sasindu = session.get(Customer.class, "C002");
//        session.evict(sasindu);
//        session.merge(sasindu);
//        sasindu = session.get(Customer.class,"C002");
//        sasindu.setName("Nipun");

        session.getTransaction().commit();

        session.close();

        sessionFactory.close();

    }

}
