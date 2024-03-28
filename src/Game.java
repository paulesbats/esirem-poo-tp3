public class Game {

    private int startingBet;
    private int bet;

    public Game(int _startingBet, int _bet){
        this.startingBet=_startingBet;
        this.bet=_bet;
    }
    public Game(){}


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

    public void firstDraw(Player deck,Player player, Player bank){
        Card card = deck.cardDraw(0);
        player.addCardtoHand(card);
        card = deck.cardDraw(0);
        bank.addCardtoHand(card);
        card = deck.cardDraw(0);
        player.addCardtoHand(card);
    }

    public void giveaCard(Player deck, Player player){
        Card card = deck.cardDraw(0);
        player.addCardtoHand(card);
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


