import config.FactoryConfiguration;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();

        //Native SQL = SQL ma thamai
        //select * from customer;
        //select name from customer where name="Bob";
        //Select * from customer_table;



        //HQL
        //FROM Customer
        //FROM Customer WHERE name = "Bob"

//        Query<Customer> query = session.createQuery("SELECT c FROM Customer c", Customer.class);
//        List<Customer> customers = query.list();

//        Query<Customer> query = session.createQuery("SELECT c FROM Customer c WHERE c.name='Bob'", Customer.class);//name kiyl thinne Entity class eke property ekak
//        List<Customer> customers = query.list();


        //Parameters
        //SELECT  c FROM Customer c.name=?
        //setObject(1,'Bob')

//        Query<Customer> query = session.createQuery("SELECT c FROM Customer c WHERE c.name= :hello", Customer.class); //:hello kiynne parameter ekt
//        query.setParameter("hello", "Bob"); //me values tika gihilla set wenne :hello kiyn parameter ekt
//        List<Customer> customers = query.list();


//SQL queries run krn widiha
//        Query<Customer> query = session.createNativeQuery("SELECT * FROM customer_table ", Customer.class);
//        List<Customer> customers = query.list();

//        Query<Customer> query = session.createNativeQuery("SELECT * FROM customer_table ").addEntity(Customer.class);//Customer class eka uda thina(Argument widihata pass krnw) widihatati me widihatati (addEntity method eka use krl )2tm denn puluwn
//        List<Customer> customers = query.list();

//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }

        Query query = session.createNativeQuery("SELECT * FROM customer_table");
        List<Object[]> list = query.list();//Object array list ekk me

       for (Object[] objects : list) {

//           System.out.println(Arrays.toString(objects)); mehema dilath gnn puluwn

//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(i + " : " + objects[i]);
//        }

        Customer customer = new Customer();
//        customer.setId(Integer.parseInt((String) objects[0]));
        customer.setName((String) objects[2]);
        customer.setEmail((String) objects[1]);
           System.out.println(customer);
       }

        session.close();
    }
}
