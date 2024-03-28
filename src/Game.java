public class Game {

    private int credit;
    private int startingBet;
    private int bet;

    public Game(int _credit, int _startingBet, int _bet){
        this.credit=_credit;
        this.startingBet=_startingBet;
        this.bet=_bet;
    }

    public void setCredit(int _credit){
        this.credit=_credit;
    }

    public void setStartingBet(int _startingBet){
        this.startingBet=_startingBet;
    }

    public void setBet(int _bet){
        this.bet=_bet;
    }

    public int getCredit(){
        return this.credit;
    }

    public int getStartingBet(){
        return this.startingBet;
    }

    public int getBet(){
        return this.bet;
    }

    public void winner(Player player, Player bank){
        /* Points are counted as in the Wikipedia documentation only the blackjack columns and lines are removed*/

        if(player.getPlayerPoint()==bank.getPlayerPoint()){
            System.out.println("equality");
        }
        else if(player.getPlayerPoint()>bank.getPlayerPoint()){
            System.out.println("Player win the game");
            player.addPlayerAmount(bet);
        }
        else{
            System.out.println("Bank win the game");
            player.addPlayerAmount(-(bet));
        }

    }

}
