package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Employee;
import lk.ijse.dep.hibernate.entity.Spouse;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOne {

    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtil.getSessionFactory(); Session session = sf.openSession()) {
            session.beginTransaction();

            Employee alisa = session.get(Employee.class,"E001");
            Spouse leela = session.get(Spouse.class,"S002");
            alisa.setSpouse(leela);
//            Employee leela = new Employee("E002", "Alisa", "Pinwatte");
         //   Spouse spouse = new Spouse("S002", "Alis", "123", leela);

//         session.save(leela);
        // session.save(alisa);

//            session.update(spouse);



/*
            Employee alisa = session.get(Employee.class, "E001");
            Spouse spouse = new Spouse("S002", "Samanwathi", "456", alisa);

            session.save(spouse);
*/
//            Spouse alis = session.get(Spouse.class, "S001");
//            alis.getEmployee().setName("Alisa+");

//            Employee alisa = session.get(Employee.class, "E001");
//            System.out.println(alisa.getSpouse());

//            Employee leel = new Employee("E002", "Leel", "Mathugama");
//            Spouse lili = new Spouse("S002", "lili", "123", leel);
//
//            session.save(leel);
//            session.save(lili);

            //Spouse alis = session.get(Spouse.class, "S001");
            //Spouse lili = session.get(Spouse.class, "S002");
//            Employee alisa = session.get(Employee.class, "E001");

            //System.out.println("==============");
            //System.out.println(alis.getEmployee());
//            System.out.println(alisa.getSpouse());

            ///Employee leel = session.get(Employee.class, "E002");

//            lili.setEmployee(alisa);
            //leel.setSpouse(lili);
//            leel.getSpouse().setContactNumber("077-123456");

            session.getTransaction().commit();
        }
    }
}
