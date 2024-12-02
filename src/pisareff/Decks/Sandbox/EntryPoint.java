package pisareff.Decks.Sandbox;

import java.util.List;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) {
        List<Card> Deck = Card.createDeck();
        System.out.println("=======Deck=======" + "\n" + Deck);
        Card.shuffleDeck(Deck);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Deck======="+ "\n"+ Deck);

        int DrawCount = 5;

        List<Card> MyHand = GetHand(Deck,DrawCount);

        Deck = Deck.stream().skip(DrawCount)
                            .sorted((Card a, Card b)-> (int)(Math.random()*((1- -1)+1))+-1)
                            .collect(Collectors.toList());

        List<Card> OpponentsHand = GetHand(Deck,DrawCount);

        Deck = Deck.stream()
                   .skip(DrawCount)
                   .collect(Collectors.toList());

        System.out.println("\n"+ "\n"+ "\n"+ "=======My hand======="+ "\n"+ MyHand);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Opponents hand======="+ "\n"+ OpponentsHand);
        System.out.println("\n"+ "\n"+ "\n"+ "=======Deck======="+ "\n"+ Deck);



    }
    public static List<Card> GetHand(List<Card> Deck, int Amount){

        List<Card> Hand = Deck.stream()
                .limit(Amount)
                .collect(Collectors.toList());
        return Hand;
    }
}

