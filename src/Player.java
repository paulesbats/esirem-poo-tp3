import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Player {
    private int amount;
    private List<Card> Hand;

    public Player() {
        this.Hand = new ArrayList<>();
    }

    public void setAmount(int a) {
        this.amount = a;
    }

    public int getAmount() {
        return this.amount;
    }

    public List<Card> getHand() {
        return this.Hand;
    }

    public void show_Hand(List<Card> Hand) {
        Card firstCard = Hand.get(0);
    }

    public void addCardtoHand(Card newCard) {
        this.Hand.add(newCard);
    }

    public int CountHand() {
        return this.Hand.size();
    }

    public Card getCardAtIndex(int index) {
        if (index >= 0 && index < this.Hand.size()) {
            return this.Hand.get(index);
        } else {
            return null;
        }
    }
}
