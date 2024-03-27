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
}
