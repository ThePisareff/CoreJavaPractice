package pisareff.Decks.RawCollections;

import java.util.LinkedList;
import java.util.List;

public class Card implements Comparable<Card>{
    private final CardValue value;
    private final CardSuit suit;

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" + value + " of " + suit + '}' + "\n";
    }


    @Override
    public int compareTo(Card card) {
        return this.suit.ordinal() - card.suit.ordinal();
    }

    public static List<Card> createDeck(){

        List<Card> Deck = new LinkedList<>();

        for( CardSuit suit : CardSuit.values()){
            for (CardValue value : CardValue.values())
                Deck.add(new Card(value, suit));
        }
        return Deck;
    }

    static void shuffleDeck(List<Card> Deck){
        Deck.sort(new Shuffler<Card>());
    }
}
