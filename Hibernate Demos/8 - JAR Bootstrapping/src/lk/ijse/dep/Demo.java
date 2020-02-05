package lk.ijse.dep;

import lk.ijse.dep.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dep4");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Customer cus = new Customer("Kasun");
        em.merge(cus);
        System.out.println(em.contains(cus));
        em.getTransaction().commit();
        emf.close();
    }
}
