package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.*;
import lk.ijse.dep.hibernate.utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;

public class Appinitializer {
    public static void main(String[] args) {

        try (SessionFactory sf = HibernateUtill.getSessionFactory();
             Session session = sf.openSession()) {

            session.beginTransaction();


            Customer kasun= new Customer("C001","Alisa","Galle");
           // Order order = new Order("OD001", Date.valueOf("2019-09-09") );
           // kasun.addOrder(order);
            session.persist(kasun);


            Customer Nimal= new Customer("C002","Nimal","Kandy");
//            Order order1 = new Order("OD002", Date.valueOf("2019-09-09") );
//            Nimal.addOrder(order1);
            session.persist(Nimal);


            Customer Janith= new Customer("C003","Janith","Colombo");
//            Order order2 = new Order("OD003", Date.valueOf("2019-09-09") );
//            Janith.addOrder(order2);
            session.persist(Janith);


            Customer Michal= new Customer("C004","Michal","Colombo");
//            Order order3 = new Order("OD004", Date.valueOf("2019-09-09") );
//            Janith.addOrder(order3);
            session.persist(Michal);
//===============================================
//            Customer alisa = session.get(Customer.class,"C001");
//            Order order =session.get(Order.class,"OD001");
//            alisa.removeOrder(order);
//================================================

//            Order od001 =new Order("OD002",Date.valueOf("2019-02-02"));
//            Item soap = new Item("I001","Soap","50",55);
//            Item mouse = new Item("I002","Mouse","50",55);
//
//            OrderDetail orderDetail = new OrderDetail(
//                    new OrderDetailPK(od001.getId(),soap.getId()),22,33);
//            orderDetail.setItem(soap);
//            od001.addOrderDetails(orderDetail);
//            OrderDetail orderDetail1 = new OrderDetail(
//                    new OrderDetailPK(od001.getId(),mouse.getId()),22,34);
//            orderDetail1.setItem(mouse);
//            od001.addOrderDetails(orderDetail1);
//            session.persist(od001);
//=================================================
//            Order od001 =new Order("OD003",Date.valueOf("2019-02-02"));
//            Item soap = new Item("I003","Soap","50",55);
//            Item mouse = new Item("I004","Mouse","50",55);
//
//            OrderDetail orderDetail = new OrderDetail(
//                    new OrderDetailPK(od001.getId(),soap.getId()),22,33);
//            orderDetail.setItem(soap);
//            od001.getOrderDetails().add(orderDetail);
//
//
//            OrderDetail orderDetail1 = new OrderDetail(
//                    new OrderDetailPK(od001.getId(),mouse.getId()),22,34);
//            orderDetail1.setItem(mouse);
//            od001.getOrderDetails().add(orderDetail1);
//
//            session.persist(od001);
//
//==================================================
//          Order od001 = new Order("OD001",Date.valueOf("2019-01-01"));
//          session.persist(od001);
//
//          Order od02= session.get(Order.class,"OD002");
//          session.remove(od02);
//          Order od003 = session.load(Order.class, "OD003");
//          od02.getOrderDetails();
          session.getTransaction().commit();
        }

    }

}
