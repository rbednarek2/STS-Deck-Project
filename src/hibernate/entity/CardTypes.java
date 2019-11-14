package hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "card_types")
public class CardTypes {
    @Id
    @Column(name = "type_nm")
    private String cardType;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private List<Card> Cards;

    public CardTypes() {
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public List<Card> getCards() {
        return Cards;
    }

    public void setCards(List<Card> cards) {
        Cards = cards;
    }
}
