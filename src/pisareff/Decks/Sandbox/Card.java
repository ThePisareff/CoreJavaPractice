package pisareff.Decks.Sandbox;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Card implements Comparable<Card>{
    private CardValue value;
    private CardSuit suit;

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String s ="";
        String v ="";
        String Card = "";

        switch (value) {
            case TWO : v = "2";
                break;
            case THREE: v = "3";
                break;
            case FOUR:  v = "4";
                break;
            case FIVE : v = "5";
                break;
            case SIX: v = "6";
                break;
            case SEVEN : v = "7";
                break;
            case EIGHT : v = "8";
                break;
            case NINE : v = "9";
                break;
            case TEN : v = "10";
                break;
            case JACK : v = "J";
                break;
            case KING : v = "K";
                break;
            case QUEEN : v = "Q";
                break;
            case ACE : v = "A";
                break;}


        switch (suit) {
            case DIAMONDS: s = "♦";
                break;
            case SPADES: s = "♠";
                break;
            case CLUBS: s = "♣";
                break;
            case HEARTS: s = "♥";
                break;}

        if (v == "10") {Card ="\n╔═════╗\n" +"║  "+s+"  ║\n" +"║  "+v+" ║\n" +"╚═════╝\n";}
        else {Card ="\n╔═════╗\n" +"║  "+s+"  ║\n" +"║  "+v+"  ║\n" +"╚═════╝\n";}

        return  Card;
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
        Deck.sort((Card a,Card b)-> (int) (Math.random()*((1- -1)+1))+-1);
    }
}
