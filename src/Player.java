import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Player {
    private int amount;
    private List<Card> Hand;

    public void setAmount(int a){
        this.amount = a;
    }

    public int getAmount(){
        return this.amount;
    }

    public Player() {
        this.Hand = new ArrayList<>();
    }

    public List<Card> getHand(){
        return this.Hand;
    }

}
