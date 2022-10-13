package model;

import java.util.List;

public class Card {
    private List<Balance> balance;
    private CardData cardData;

    public Card() {
    }

    public Card(CardData cardData) {
        this.cardData = cardData;
    }

    public List<Balance> getBalance() {
        return balance;
    }

    public void setBalance(List<Balance> balance) {
        this.balance = balance;
    }

    public CardData getCardData() {
        return cardData;
    }

    public void setCardData(CardData cardData) {
        this.cardData = cardData;
    }

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                ", cardData=" + cardData +
                '}';
    }
}
