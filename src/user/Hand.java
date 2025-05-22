package user;

import java.util.ArrayList;

import cards.Card;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();

    public Hand() {
        cards = new ArrayList<>();
    }

    public int addCard(Card card) {
        cards.add(card);
        return getValue();
    }

    public int getValue() {
        int total = 0;
        int aceCount = 0;

        for (Card c : cards) {
            int val = c.getValue();
            if (val == 1) {
                aceCount++;
                total += 11;
            } else if (val > 10) {
                total += 10;
            } else {
                total += val;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public boolean isSoft() {
        int total = 0;
        int aceCount = 0;

        for (Card c : cards) {
            int val = c.getValue();
            if (val == 1) {
                aceCount++;
                total += 11;
            } else if (val > 10) {
                total += 10;
            } else {
                total += val;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return aceCount > 0;
    }
}
