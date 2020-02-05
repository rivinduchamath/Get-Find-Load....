package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Custom_Entity;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import javax.xml.transform.Transformer;
import java.util.List;

public class CreateQueryDEMO9JOIN {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

//Native


            Query<Custom_Entity> nativequery = session.createQuery("SELECT NEW lk.ijse.dep.hibernate.entity.Custom_Entity( " +
                            "o.id,o.date,SUM(od.qty * od.unitePrice),c.id,c.name )" +
                            "FROM Order o inner JOIN o.orderDetails od INNER JOIN o.customer c " +
                            "GROUP BY o.id",Custom_Entity.class);

            //Query<Custom_Entity> query1 = nativequery.setResultTransformer(Transformers.aliasToBean(Custom_Entity.class));
            List<Custom_Entity> list = nativequery.list();
            list.forEach(System.out::println);

            session.getTransaction().commit();

        }
    }
}
