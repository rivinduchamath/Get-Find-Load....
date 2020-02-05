package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.entity.Item;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import javax.persistence.NamedQuery;
import java.util.List;

public class CreateQueryDEMO6 {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
             session.beginTransaction();

//Native
            System.out.println("=============================NATIVE=================================\n");
            Query<Customer> query = session.getNamedQuery("query1");
            System.out.println(query.list().get(0).getName());

//JPA
            System.out.println("++++++++++++++++++++++++++JPA+++++++++++++++++++++++++++++++++++++++\n");
            Query<Customer> query1= session.createNamedQuery("query2");
            query1.setParameter(1,"C001");
            Customer customer = query1.getSingleResult();
            System.out.println(customer);

            System.out.println("===========================NATIVE===================================\n");
//Native
            NativeQuery<Item> query3 = session.getNamedNativeQuery("query3").addEntity(Item.class);
            List<Item> list = query3.list();
            list.forEach(System.out::println);

//JPA
            System.out.println("++++++++++++++++++++++++++JPA+++++++++++++++++++++++++++++++++++++++\n");

            Query query4= session.createNamedQuery("query3");
            List<Object[]> list1 = query4.list();
            Object[] item = list1.get(0);
            System.out.println(item[0]);
            System.out.println(item[1]);
            System.out.println(item[2]);

            System.out.println("//////////////////////////////////////////////////////////////////////\n");

//Above Without Object

            Query<Item> query2 = session.createNamedQuery("query4");
            List<Item > list2 = query2.list();
            list2.forEach(System.out::println);


            session.getTransaction().commit();

        }
    }
}
