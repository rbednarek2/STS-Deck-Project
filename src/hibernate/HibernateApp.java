package hibernate;

import hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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

    private void createCard () {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Card card = new Card(1, "Deal 6 damage", "url", "Ironclad", "Basic", "Attack");
        session.save(card);

        session.getTransaction().commit();
    }

    private void getCard (int cardId) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Card card = session.get(Card.class, cardId);

        System.out.println(card);

        session.getTransaction().commit();
    }

    private void updateCard (int cardId) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Card card = session.get(Card.class, cardId);
        card.setCost(8);

        session.beginTransaction().commit();
    }

    private void deleteCard (int cardId) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Card card = session.get(Card.class, cardId);
        session.delete(card);

        session.beginTransaction().commit();
    }
}
