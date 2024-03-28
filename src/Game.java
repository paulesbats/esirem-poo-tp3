public class Game {

    private int startingBet;
    private int bet;
    private boolean insurance;

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

    public void setInsurance(boolean _insurance){
        this.insurance=_insurance;
    }

    public int getStartingBet(){
        return this.startingBet;
    }

    public int getBet(){
        return this.bet;
    }

    public boolean getInsurance(){
        return this.insurance;
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

    public void insurancePoint(Player player,Player bank){
        /* need to be call when bank receive his second card*/
        int insuranceCredit = bet/2;

        if(insurance){
            if(bank.CountPoint()==21 ){
                player.addPlayerAmount(insuranceCredit*2);
            }
            else{
                player.addPlayerAmount(-(insuranceCredit));
            }
        }

    }

}


