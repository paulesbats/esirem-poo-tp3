public class Game {

    private int startingBet;
    private int bet;

    public Game(int _startingBet, int _bet){
        this.startingBet=_startingBet;
        this.bet=_bet;
    }


    public void setStartingBet(int _startingBet){
        this.startingBet=_startingBet;
    }

    public void setBet(int _bet){
        this.bet=_bet;
    }

    public int getStartingBet(){
        return this.startingBet;
    }

    public int getBet(){
        return this.bet;
    }
}


