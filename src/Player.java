public class Player {
    private int amount;
    private CardList player_CL;

    public Player(int amount, CardList player_CL) {
        this.amount = amount;
        this.player_CL = player_CL;
    }

    public void setAmount(int a){
        this.amount = a;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setPlayer_CL(CardList newCl){
        this.player_CL = newCl;
    }

    public CardList getPlayer_CL(){
        return this.player_CL;
    }
    public void show_hand(){

    }


}
