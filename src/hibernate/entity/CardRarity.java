package hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "card_classes")
public class CardRarity {
    @Id
    @Column(name = "card_rarity")
    private String Rarity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private List<Card> Cards;

    public CardRarity() {
    }

    @Override
    public String toString() {
        return "Rarity: " + Rarity;
    }

    public String getRarity() {
        return Rarity;
    }

    public void setRarity(String rarity) {
        Rarity = rarity;
    }

    public List<Card> getCards() {
        return Cards;
    }

    public void setCards(List<Card> cards) {
        Cards = cards;
    }
}
