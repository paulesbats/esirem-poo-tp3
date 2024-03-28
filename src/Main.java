public class Main {
    public static void main(String[] args) {
        System.out.print("Game Start\n");

        Game game = new Game();
        Player deck = new Player();
        Player player = new Player();
        Player bank = new Player();
        deck.createDeck();
        deck.shuffleDeck();

        game.firstDraw(deck,player,bank);

        deck.showHand();
        System.out.print("////////////\n");
        player.showHand();
        System.out.print("////////////\n");
        bank.showHand();

        game.giveaCard(deck,player);
        System.out.print("////////////\n");
        player.showHand();
        System.out.print("////////////\n");
        game.giveaCard(deck,bank);
        bank.showHand();

    }
}