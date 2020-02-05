package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Person;
import lk.ijse.dep.hibernate.entity.Pet;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOne2 {

    public static void main(String[] args) {

        try (SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            /*

            Person leela = new Person("M001", "Leela", "Mathugama");
            Person dilini = new Person("M002", "Dilini", "Ambalangoada");

            Pet ballek = new Pet("P001", "Ballek");
            Pet poosek = new Pet("P002", "Poosek");

            session.update(leela);
            //poosek.setPerson(leela);
            //session.persist(poosek);
            ballek.setPerson(leela);
            session.persist(ballek);

             */

            //=========================================

/*            Person leela = session.get(Person.class, "M001");
            System.out.println(leela.getPet());*/

//            Pet ballek =  session.get(Pet.class, "P001");
//            ballek.setPerson(null);

            Person dilini = session.get(Person.class, "M002");
            dilini.setPet(null);

            //=========================================

//            Person dilini = new Person("M002", "Dilini", "Ambalangoada");
//            Pet ballek = new Pet("P001", "Ballek");
//
//            dilini.setPet(ballek);
//
//            session.persist(dilini);

            session.getTransaction().commit();
        }

    }

}
