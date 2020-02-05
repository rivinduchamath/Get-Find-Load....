package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CreateQueryDEMO2 {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();
//
//            //Introduced By JPQL
//            Query query = session.createQuery(
//                    "SELECT c FROM lk.ijse.dep.hibernate.entity.Customer c");//Customer Is a object to table
//            //If we want to colum we must add a attribute
//
//            //Introduced BY HQL
//            //   Query query = session.createQuery(
//            //  "FROM Customer c");//Customer Is a object to table
//            //If we want to colum we must add a attribute
//
//            //Native HB
//            List list = query.list();
//
//            //JPA
//            list= query.getResultList();
//            Customer c = (Customer) list.get(0);
//            c.setName("Alisa");
//==================================================================================================
            //Introduced By JPQL
            Query<Customer> query = session.createQuery(
                    "SELECT c FROM lk.ijse.dep.hibernate.entity.Customer c",Customer.class);//Customer Is a object to table
            //If we want to colum we must add a attribute

            //Introduced BY HQL
             query = session.createQuery("FROM Customer c",Customer.class);//Customer Is a object to table
            //If we want to colum we must add a attribute

            //Native HB
            List<Customer> list = query.list();

            //JPA
            list= query.getResultList();
            Customer c =  list.get(0);
            c.setName("Alisa");
          //  list.forEach(System.out::println);
            session.getTransaction().commit();

        }
    }
}
