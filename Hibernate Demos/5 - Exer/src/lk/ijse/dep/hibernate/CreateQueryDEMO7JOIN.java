package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.entity.Item;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class CreateQueryDEMO7JOIN {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

//Native


            Query<Object[]> query = session.createNativeQuery(
                    "select o.id,o.date,SUM(od.qty * od.unitePrice),co.customer_id,cu.name " +
                            "from `order` o " +
                            "INNER JOIN orderdetail od on od.orderId = o.id " +
                            "INNER JOIN  customer_order co ON co.order_id = o.id " +
                            "INNER  JOIN  customer cu ON cu.id = co.customer_id WHERE o.id = ?");

            query.setParameter(1, "OD001");
            List<Object[]> list = query.list();
            list.forEach(objects -> {
                System.out.println("Order ID " + objects[0]);
                System.out.println("Order Date " + objects[1]);
                System.out.println("Order Total " + objects[2]);
                System.out.println("Order Customer ID " + objects[3]);
                System.out.println("Order Customer Name " + objects[4]);
            });


            session.getTransaction().commit();

        }
    }
}
