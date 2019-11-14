package hibernate;

import hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp {
    private SessionFactory factory;

    public HibernateApp(){
        factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Card.class)
                .addAnnotatedClass(CardClasses.class)
                .addAnnotatedClass(CardRarity.class)
                .addAnnotatedClass(CardTypes.class)
                .buildSessionFactory();
    }

    public static void main(String[] args) {

    }
}
