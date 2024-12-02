package pisareff.Decks.CollectionsWithLambdas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        List<Card> Deck = Card.createDeck();
        System.out.println("=======Hand 2=======" + "\n" + Deck);
        Card.shuffleDeck(Deck);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Hand 2======="+ "\n"+ Deck);

        List<Card> MyHand = GetHand(Deck.iterator(),5);
        List<Card> OpponentsHand = GetHand(Deck.iterator(),5);

        System.out.println("\n"+ "\n"+ "\n"+ "=======My hand======="+ "\n"+ MyHand);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Opponents hand======="+ "\n"+ OpponentsHand);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Deck======="+ "\n"+ Deck);



    }
    public static List<Card> GetHand(Iterator<Card> iterator,int Count){
        List<Card> Hand = new LinkedList<>();
        for (int i=0; i<Count; i++){
            Hand.add(iterator.next());
            iterator.remove();
        }
        return Hand;
    }
}

