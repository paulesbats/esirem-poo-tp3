public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        Player deck=new Player();

        deck.createDeck();
        deck.show_Hand();

        //fixing commentary

        /*

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getHand().get(i).getValue());
            System.out.println(deck.getHand().get(i).getType());
        }
        deck.shuffleDeck();

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getHand().get(i).getValue());
            System.out.println(deck.getHand().get(i).getType());
        }
        */
    }
}