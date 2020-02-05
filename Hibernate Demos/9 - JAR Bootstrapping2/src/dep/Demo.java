package dep;



import dep.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.*;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {
//External Resource
        File file = new File("\\C:\\Users\\User\\Desktop\\application.properties");
        FileInputStream fileInputStream =new FileInputStream(file);


 //Internal Resource       (go to the jar file)
       // InputStream fileInputStream = Demo.class.getResourceAsStream("/application.properties");

        //Common if Internal Or External
        Properties jpaProper =new Properties();
        jpaProper.load(fileInputStream);
        fileInputStream.close();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dep4-second",jpaProper);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Customer cus = new Customer("Kasuna");
        em.merge(cus);
        System.out.println(em.contains(cus));
        em.getTransaction().commit();
        emf.close();
    }
}
