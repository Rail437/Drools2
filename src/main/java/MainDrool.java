import com.github.javaparser.utils.Log;
import model.Card;
import model.CardData;
import model.Status;
import org.kie.api.KieServices;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.ArrayList;
import java.util.List;

public class MainDrool {
    public static void main(String[] args) {
        Status status = new Status("действующая","00","NORMAL","Active");
        Status status2 = new Status("действующая","01","NORMAL","Not Active");
        CardData cardData = new CardData(status);
        CardData cardData2 = new CardData(status2);
        Card card = new Card(cardData);
        Card card2 = new Card(cardData2);
        cardData.setTarif("Opencard Зарплатная");
        card.setCardData(cardData);
        List<Card> cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            Integer countOpen = 0;
            Integer countActive = 0;
            KieSession kSession = kContainer.newKieSession("ksession");
            kSession.setGlobal("countOpen", countOpen);
            kSession.setGlobal("countActive", countActive);
            for (Card crd : cards) {
                kSession.insert(crd);
            }
            int i = kSession.fireAllRules();
            System.out.println("i: " + i);
            System.out.println("Active cards glob: " + kSession.getGlobal("countActive"));
            System.out.println("Active cards int: " + countActive);
            System.out.println("Open cards glob: " + kSession.getGlobal("countOpen"));
            System.out.println("Open cards int: " + countOpen);
        } catch (Throwable t) {
            t.printStackTrace();
            Log.error(t);
        }

    }


}
