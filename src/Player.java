import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Player {
    private int amount;
    private List<Card> Hand;
    private int playerPoint;

    public void addPlayerAmount(int _amount){
        this.amount += _amount;
    }

    public void setPlayerPoint(int a){
        this.playerPoint = a;
    }

    public int getPlayerPoint(){
        return this.playerPoint;
    }

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

    public void addCardtoHand(Card newCard) {
        this.Hand.add(newCard);
    }

    public int CountHand() {
        return this.Hand.size();
    }


    public void shuffleDeck() {
        Collections.shuffle(Hand);
    }

    public void createDeck() {
        int index = 0;
        String sType = "";

        for (int type = 0; type < 4; type++) {

            switch (type) {

                case 0:
                    sType = "hearts";
                    break;

                case 1:
                    sType = "diamonds";
                    break;

                case 2:
                    sType = "spades";
                    break;

                case 3:
                    sType = "clubs";
                    break;

                default:

            }
            for (int value = 1; value < 14; value++) {
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


    public void showHand() {

        int size = Hand.size();

        Card newCard = Hand.get(0);
        for(int i=0;i<size;i++){

            //Card firstCard = Hand.get(0);
            System.out.println("\nVoici la carte " + i + ":");
            switch (newCard.getType()) {
                case "clubs":
                    System.out.println("Color : CLUBS  ");
                    break;
                case "spades":
                    System.out.println("Color : SPADES  ");
                    break;
                case "diamonds":
                    System.out.println("Color : DIAMONDS  ");
                    break;
                case "hearts":
                    System.out.println("Color : HEARTS  ");
                    break;
            }
            if (newCard.getValue() <= 10) {
                System.out.println("Value = " + newCard.getValue());
            } else if (newCard.getValue() == 11) {
                System.out.println("Value = JACK");
            } else if (newCard.getValue() == 12) {
                System.out.println("Value = QUEEN");
            } else {
                System.out.println("Value = KING");
            }

            newCard = Hand.get(i);
        }
    }

    public Card getCardAtIndex(int index) {
        if (index >= 0 && index < this.Hand.size()) {
            return this.Hand.get(index);
        } else {
            return null;
        }
    }

    public void CountPoint(){

        int handPoint = 0;
        Card playerCard = this.Hand.get(0);
        int cardValue = playerCard.getValue();

        List<Card> playerHand= this.Hand;
        if( cardValue<=10 ){
            cardValue = playerCard.getValue();
        }
        else{
            cardValue = 10;
        }

        for(int i = 0 ; i < playerHand.size() ; i++){
            if(handPoint <= 21){
                playerCard = this.Hand.get(0);
                handPoint = handPoint + cardValue;
            }
            else{
                handPoint = -4 ; // si le joueur bust il prend -4 en valeurs de points
            }
        }
        this.setPlayerPoint(handPoint);
    }
}


