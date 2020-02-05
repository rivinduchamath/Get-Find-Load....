package lk.ijse.dep.hibernate.util;

import lk.ijse.dep.hibernate.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        // (1)
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .loadProperties("application.properties")
                .build();

        // (2)
        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(ActorMovie.class)
                .addAnnotatedClass(Actor2.class)
                .addAnnotatedClass(Movie2.class)
//                .addAnnotatedClass(Customer2.class)
//                .addAnnotatedClass(Order2.class)
//                .addAnnotatedClass(Person.class)
//                .addAnnotatedClass(Pet.class)
//                .addAnnotatedClass(Actor.class)
//                .addAnnotatedClass(Movie.class)
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Spouse.class)
//                .addAnnotatedClass(Customer.class)
//                .addAnnotatedClass(Order.class)
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
