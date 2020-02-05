package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CreateQueryDEMO8JOIN {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

//JP


            Query query = session.createQuery("SELECT  o.id ,o.date FROM lk.ijse.dep.hibernate.entity.Order o " +
                    "INNER JOIN o.customer cu ");


            List<Object[]> list = query.list();
            list.forEach(objects -> {
                System.out.println("OrderID " + objects[0]);
//                System.out.println("Order Date " + objects[1]);
//                System.out.println("Order Total " + objects[2]);
//                System.out.println("Order Customer ID " + objects[3]);
//                System.out.println("Order Customer Name " + objects[4]);
            });


            Query query1 = session.createQuery("SELECT  o.id ,it.description FROM lk.ijse.dep.hibernate.entity.Order o " +
                    " INNER  JOIN o.orderDetails od INNER JOIN od.item it WHERE o.id ='OD001'");


            List<Object[]> list2 = query1.list();
            list2.forEach(objects -> {
                System.out.println("OrderID " + objects[0]);
                System.out.println("Order name " + objects[1]);
//                System.out.println("Order Total " + objects[2]);
//                System.out.println("Order Customer ID " + objects[3]);
//                System.out.println("Order Customer Name " + objects[4]);
            });


            session.getTransaction().commit();

        }
    }
}
