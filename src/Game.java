import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {


    private int bet;

    private boolean insurance;

    public Game(int _bet) {
        this.bet = _bet;
    }

    public Game() {
    }


    public void setBet(int _bet) {
        this.bet = _bet;
    }

    public int getBet() {
        return this.bet;
    }

    public void setInsurance(boolean _insurance){
        this.insurance=_insurance;
    }

    public void firstDraw(Player deck, Player player, Player bank) {
        Card card = deck.cardDraw();
        player.addCardtoHand(card);
        card = deck.cardDraw();
        bank.addCardtoHand(card);
        card = deck.cardDraw();
        player.addCardtoHand(card);

    }

    public void giveaCard(Player deck, Player player) {
        Card card = deck.cardDraw();
        player.addCardtoHand(card);
    }

    public void winner(Player player, Player bank) {
        /* Points are counted as in the Wikipedia documentation only the blackjack columns and lines are removed*/

        if (player.getPlayerPoint() == bank.getPlayerPoint()) {
            System.out.println("equality");
        } else if (player.getPlayerPoint() > bank.getPlayerPoint()) {
            System.out.println("Player win the game");
            player.addPlayerAmount(bet);
        } else {
            System.out.println("Bank win the game");
            player.addPlayerAmount(-(bet));
        }
    }
    public void insurancePoint(Player player,Player bank){
        int insuranceCredit=bet/2;
        if(insurance){
            if(bank.getPlayerPoint()==21){
                player.addPlayerAmount(insuranceCredit*2);
            }
            else{
                player.addPlayerAmount(-insuranceCredit);
            }
        }

    }
    public void displayShowHand(Player player,Player bank){
        System.out.println("-----------------------------------------------------------");
        player.showHand();
        System.out.println("-----------------------------------------------------------");
        bank.showHand();
        System.out.println("-----------------------------------------------------------");
    }

    public static void round() {

        Game game = new Game(0);
        Player player = new Player();
        Player bank = new Player();
        Player deck = new Player();

        BufferedReader console;
        console = new BufferedReader(new InputStreamReader(System.in));

        player.setAmount(100);
        String choice = "";
        boolean secondIteration=true;


        deck.createDeck();
        deck.shuffleDeck();
        game.firstDraw(deck, player, bank);

        game.displayShowHand(player,bank);

        bank.CountPoint();

        if(bank.getPlayerPoint()==10 || bank.getPlayerPoint()==11){
            System.out.println("Do you want take insurance ? yes:y | no:n");
            try {
                choice = console.readLine();
            }
            catch (Exception e) {
                System.out.println(e);
            }
            if(choice.equals("y")){
                game.setInsurance(true);
            }
            else{
                game.setInsurance(false);
            }

        }

        System.out.println("What do you want do ? Hit:h | Stand:st | Surrender:su");
        try {
            choice = console.readLine();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        player.CountPoint();

        while (choice.equals("h") && player.getPlayerPoint()<21 && player.getPlayerPoint()>=0) {

            player.addCardtoHand(deck.cardDraw());
            game.displayShowHand(player,bank);
            player.CountPoint();
            System.out.println(player.getPlayerPoint());

            if(player.getPlayerPoint()<21 && player.getPlayerPoint()>=0) {

                System.out.println("What do you want do ? Hit:h | Stand:st | Surrender:su");
                try {
                    choice = console.readLine();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }

        bank.CountPoint();

        if(!choice.equals("su")) {
            while (bank.getPlayerPoint() < 17) {
                bank.addCardtoHand(deck.cardDraw());
                bank.CountPoint();

                if (secondIteration) {
                    game.insurancePoint(player, bank);
                    secondIteration = false;
                }

            }
        }


        game.displayShowHand(player,bank);
        if(!choice.equals("su")) {
            game.winner(player, bank);
        }
        else{
            System.out.println("Player have lose");
        }
    }
}


