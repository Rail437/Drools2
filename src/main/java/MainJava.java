import model.Card;
import model.CardData;
import model.Status;

import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        Status status = new Status("действующая","00","NORMAL","Active");
        Status status2 = new Status("действующая","00","NORMAL","Active");
        CardData cardData = new CardData(status);
        CardData cardData2 = new CardData(status2);
        Card card = new Card(cardData);
        Card card2 = new Card(cardData2);
        cardData.setTarif("Opencard Зарплатная");
        card.setCardData(cardData);
        List<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        //Вариант получения списка с картами может быть разным.

        //Задание 1.1
        long openCartCount = cards.stream().filter((c)-> c.getCardData().getTarif() == "Opencard Зарплатная").count();

        //Задание 1.2
        long activeCartCount = cards.stream()
                .filter((c)-> (c.getCardData().getStatus().getPlasticStatus() == "Active") &&
                        (c.getCardData().getStatus().getStatusCode() == "00") ).count();

        //Задание 2.1
        updateTarif(cards ,"15220178", "new Tarif");

        //Задание 2.1
        updateCardHolderName(cards ,"15220178", "new Name");
    }

    private static void updateTarif(List<Card> cards ,String cardID, String newTarif) {
        for (Card card : cards){
            if(cardID.equals(card.getCardData().getCardID())){
                card.getCardData().setTarif(newTarif);
                return;
            }
        }
        System.out.println("У вас нет такой карты");
    }

    private static void updateCardHolderName(List<Card> cards ,String cardID, String cardHolderName) {
        for (Card card : cards){
            if(cardID.equals(card.getCardData().getCardID())){
                card.getCardData().setCardHolderName(cardHolderName);
                return;
            }
        }
        System.out.println("У вас нет такой карты");
    }
}
