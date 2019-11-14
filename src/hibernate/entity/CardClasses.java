package hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "card_classes")
public class CardClasses {
    @Id
    @Column(name = "class_nm")
    private String className;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private List  <Card> Cards;

    public CardClasses() {
    }


    @Override
    public String toString() {
        return "Class: " + className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Card> getCards() {
        return Cards;
    }

    public void setCards(List<Card> cards) {
        Cards = cards;
    }
}
