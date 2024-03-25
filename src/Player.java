import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Player {
    private int amount;
    private List<Card> Hand;

    public Player() {
        this.Hand = new ArrayList<>();
    }

    public void setAmount(int a){
        this.amount = a;
    }

    public int getAmount(){
        return this.amount;
    }

    public List<Card> getHand(){
        return this.Hand;
    }

    public void show_Hand(List<Card> Hand){

        Card firstCard = Hand.get(0);
        System.out.println("Voici la carte 1 :\n");
        switch (firstCard.getType())
        {
            case "clubs":
                System.out.println("Color : CLUBS | "); ;
                break;
            case "spades":
                System.out.println("Color : SPADES | ") ;
                break;
            case "diamonds":
                System.out.println("Color : DIAMONDS | ") ;
                break;
            case "hearts":
                System.out.println("Color : HEARTS | ") ;
                break;
        }
        if(firstCard.getValue() <= 10){


        }


    }

}
