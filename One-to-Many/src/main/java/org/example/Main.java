package org.example;

import config.FactoryConfiguration;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();

        Customer customer = new Customer();
       // customer.setId(1); ids set krnne nh mokd @Generated dila thina nisa
        customer.setName("Amal");

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrderDate("2025/02/20");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setOrderDate("2025/02/19");
        order2.setCustomer(customer);

        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

        //save
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

        session.close();
    }
}