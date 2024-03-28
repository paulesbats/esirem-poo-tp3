public class Game {


    private int bet;

    public Game(int _bet){
        this.bet=_bet;
    }
    public Game(){}


    public void setBet(int _bet){
        this.bet=_bet;
    }

    public int getBet(){
        return this.bet;
    }

    public void firstDraw(Player deck,Player player, Player bank){
        Card card = deck.cardDraw();
        player.addCardtoHand(card);
        card = deck.cardDraw();
        bank.addCardtoHand(card);
        card = deck.cardDraw();
        player.addCardtoHand(card);

    }

    public void giveaCard(Player deck, Player player){
        Card card = deck.cardDraw();
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

    public static void round(){

        Game game= new Game(0);

        Player player=new Player();
        Player bank=new Player();
        Player deck=new Player();

        player.setAmount(100);


        deck.createDeck();
        deck.shuffleDeck();

        game.firstDraw(deck,player,bank);

        player.showHand();
        System.out.println("-----------------------------------------------------------");
        bank.showHand();


    }
}


