public class Main {
    public static void main(String[] args) {

        Player deck=new Player();
        deck.createDeck();

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getHand().get(i).getValue());
            System.out.println(deck.getHand().get(i).getType());
        }
        deck.shuffleDeck();

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getHand().get(i).getValue());
            System.out.println(deck.getHand().get(i).getType());
        }
    }
}