package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Custom_Entity;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CreateQueryDEMO10InsertInto {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

//HQL
            Query query = session.createQuery("INSERT INTO Customer (id,name,address)" +
                    " SELECT e.id,e.name,e.address FROM Employee e");
            int aff= query.executeUpdate();
            System.out.println(aff);


            session.getTransaction().commit();
        }
    }
}
