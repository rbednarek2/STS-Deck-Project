package hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "card_classes")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private int id;
    @Column(name = "cost")
    private int cost;
    @Column(name = "effect")
    private String effect;
    @Column(name = "img_url")
    private String imgURL;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_class")
    private String className;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_rarity")
    private String Rarity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_nm")
    private String cardType;

    public Card() {
    }

    public Card(int cost, String effect, String imgURL, String className, String rarity, String cardType) {
        this.cost = cost;
        this.effect = effect;
        this.imgURL = imgURL;
        this.className = className;
        Rarity = rarity;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "/Cost: " + cost +
                "/Effect: " + effect +
                "/ImgURL: " + imgURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() { return cost; }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRarity() {
        return Rarity;
    }

    public void setRarity(String rarity) {
        Rarity = rarity;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
