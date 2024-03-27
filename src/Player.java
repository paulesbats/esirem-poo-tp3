import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


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


    public void shuffleDeck(){
        Collections.shuffle(Hand);
    }

    public void createDeck(){


        int index=0;
        String sType="";

        for(int type=0;type<4;type++){

            switch(type){

                case 0:
                    sType="hearts";
                    break;

                case 1:
                    sType="diamonds";
                    break;

                case 2:
                    sType="spades";
                    break;

                case 3:
                    sType="clubs";
                    break;

                default:

            }
            for(int value=1;value<14;value++) {

                Card newCard = new Card(value, sType);

                Hand.add(index, newCard);

                index += 1;
            }

        }
    }

    public Card cardDraw(int index){

        Card cardDrawed=Hand.get(index);
        Hand.remove(index);

        return cardDrawed;
    }


    public Card getCardAtIndex(int index) {
        if (index >= 0 && index < this.Hand.size()) {
            return this.Hand.get(index);
        } else {
            return null;
        }
    }

}
