package lk.ijse.dep.hibernate.utill;

import lk.ijse.dep.hibernate.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtill {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        // (1)
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .loadProperties("application.properties")
                .build();

        // (2)
        Metadata metadata = new MetadataSources(standardRegistry)
                 .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderDetail.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        // (3)
        return metadata.getSessionFactoryBuilder()
                .build();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
