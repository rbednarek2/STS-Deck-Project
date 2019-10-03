package springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springxml.beans.Card;

public class SpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Card theCard = context.getBean("myCard", Card.class);

        System.out.println(theCard.getEffect());

        theCard.displayDetail();

        context.close();
    }
}
