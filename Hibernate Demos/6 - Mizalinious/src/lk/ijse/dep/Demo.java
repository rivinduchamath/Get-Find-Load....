package lk.ijse.dep;

import lk.ijse.dep.entity.*;
import lk.ijse.dep.utill.HibernateUtill;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.query.Query;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) throws Exception {
        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

//             session.persist(new Customer("Sumal","Galle"));
//             session.persist(new Customer("Amal","Galle"));
//             session.persist(new Customer("Amsal","Galle"));
//             session.persist(new Item("Mouse",22,3));
//             session.persist(new Item("Mousse",22,3));
//             session.persist(new Customer("ssssssss","Galle"));
//=============================================
//            PersonDetails ps = new PersonDetails(
//                    "Kamal","22","Wakwella","Galle","32323");
//            session.save(new Employee2(new Date(2019-01-01),ps));
//            session.save(new Customer2(ps));
//=============================================
//==========SAVE PIC====================================
           /* File profilePic = new File("C:\\Users\\User\\Desktop\\ww.jpg");

            FileInputStream fis = new FileInputStream(profilePic);
            byte[] leelpic = new byte[fis.available()];
            fis.read(leelpic);
            fis.close();*/
 //OR
 //====================================================
        //    byte[] leelpic  = Files.readAllBytes(Paths.get("C:\\\\Users\\\\User\\\\Desktop\\\\ww.jpg"));
//================================================
//            Student leel  = new Student("Leel",leelpic);
//            session.save(leel);
            //===========================================
            //==========================================

            //==============================================
            //===============GET PIC FROM DB================
//=====================Long Version For Get Profile Pic====================

/*
            Student lele  = session.get(Student.class,1);
            File proPic = new File("C:\\Users\\User\\Desktop\\ww.jpg");
            FileOutputStream fos = new FileOutputStream(proPic);
            fos.write(lele.getProfilePic());
            fos.close();*/
//============================================================================

            //Long version For the get Profile Picture
//            Student lele  = session.get(Student.class,1);
//            Files.write(Paths.get("C:\\Users\\User\\Desktop\\ww.jpg"),lele.getProfilePic());


  //===============================================================

            byte[] leelpic  = Files.readAllBytes(Paths.get("C:\\\\Users\\\\User\\\\Desktop\\\\ww.jpg"));
            Student2 leel  = new Student2("Leel", BlobProxy.generateProxy(leelpic));
            session.save(leel);
            session.getTransaction().commit();

        }
    }
}