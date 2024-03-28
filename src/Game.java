import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {


    private int bet;

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


        deck.createDeck();
        deck.shuffleDeck();
        game.firstDraw(deck, player, bank);

        game.displayShowHand(player,bank);

        System.out.println("What do you want do ? Hit:h | Stand:st | Surrender:su");
        try {
            choice = console.readLine();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        player.CountPoint();

        while (choice.equals("h") && player.getPlayerPoint()<21 && player.getPlayerPoint()!=-4) {

            player.addCardtoHand(deck.cardDraw());
            game.displayShowHand(player,bank);


            System.out.println("What do you want do ? Hit:h | Stand:st | Surrender:su");
            try {
                choice = console.readLine();
            }
            catch (Exception e) {
                System.out.println(e);
            }
            player.CountPoint();
        }
        System.out.println(player.getPlayerPoint());
        game.displayShowHand(player,bank);


    }
}


