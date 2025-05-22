package cards;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        String[] faces = { "Spades", "Hearts", "Diamonds", "Clubs" };
        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < faces.length; j++) {
                deck.add(new Card(i, faces[j]));
            }
        }
    }

    public String toString() {
        String c = "";
        for (int i = 0; i < deck.size(); i++) {
            c += deck.get(i).toString();
        }
        return c;
    }
}
