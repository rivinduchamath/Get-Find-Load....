package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CreateQueryDEMO3 {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            Query<Customer> query = session.createQuery("SELECT c FROM" +
                    " lk.ijse.dep.hibernate.entity.Customer c WHERE c.id ='C001'",
                    Customer.class);


            Customer customer = query.uniqueResult();
            Customer singleResult = query.getSingleResult();
            System.out.println(customer);
            System.out.println(singleResult.getAddress());
           
           
            session.getTransaction().commit();

        }
    }
}
