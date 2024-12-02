package pisareff.Decks.CollectionsWithLambdas;

import java.util.LinkedList;
import java.util.List;

public class Card implements Comparable<Card>{
    private CardValue value;
    private CardSuit suit;

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" + suit + " of " + value + '}' + "\n";
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
        Deck.sort((Card a,Card b)-> ((int)(Math.random()*((1- -1)+1))+-1));
    }
}
