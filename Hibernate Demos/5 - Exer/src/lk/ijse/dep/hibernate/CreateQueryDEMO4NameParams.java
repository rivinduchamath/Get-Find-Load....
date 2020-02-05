package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CreateQueryDEMO4NameParams {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            String customerID = "C001";


            Query<Customer> query = session.createQuery("SELECT c FROM" +
                    " lk.ijse.dep.hibernate.entity.Customer c WHERE c.id =:customerID",
                    Customer.class);

            query.setParameter("customerID","C002");

            Customer customer = query.uniqueResult();
            Customer singleResult = query.getSingleResult();
            System.out.println(customer);
            System.out.println(singleResult.getAddress());
           
           
            session.getTransaction().commit();

        }
    }
}
