package pisareff.Decks.RawCollections;

import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {

        List<Card> Deck = Card.createDeck();
        System.out.println(Deck);
        Card.shuffleDeck(Deck);
        System.out.println("\n"+ "\n"+ "\n"+ "\n"+ "\n"+ Deck);

    }

}
