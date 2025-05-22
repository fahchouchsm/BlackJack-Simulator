package cards;

import java.util.ArrayList;
import java.util.Collections;

public class Shoe {
    private ArrayList<Card> cards;

    public Shoe(int numDecks) {
        if (numDecks < 1 || numDecks > 100) {
            throw new IllegalArgumentException("numDecks must be between 1 and 100");
        }

        cards = new ArrayList<>();
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };

        for (int d = 0; d < numDecks; d++) {
            for (int value = 1; value <= 13; value++) {
                for (String suit : suits) {
                    cards.add(new Card(value, suit));
                }
            }
        }

        Collections.shuffle(cards);
    }

    public int getNumCards() {
        return cards.size();
    }

    public String getFirstCards(int limit) {
        if (limit < 1 || limit > cards.size()) {
            throw new IllegalArgumentException("Limit out of bounds");
        }

        String result = "";
        for (int i = 0; i < limit; i++) {
            result += cards.get(i).toString();
        }
        return result;
    }

    public Card draw() {
        if (cards.isEmpty())
            throw new IllegalStateException("No more cards in the shoe!");
        return cards.remove(0);
    }
}
