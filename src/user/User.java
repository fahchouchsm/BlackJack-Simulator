package user;

import java.util.ArrayList;

import cards.Card;

public abstract class User {
    protected ArrayList<Hand> hands = new ArrayList<>();
    protected int currentHand = 0;

    public User() {
        hands.add(new Hand());
    }

    public Hand getCurrentHand() {
        return hands.get(currentHand);
    }

    public int draw(Card c) {
        return getCurrentHand().addCard(c);
    }

    public boolean isBlackJack() {
        return getCurrentHand().getCards().size() == 2 && getCurrentHand().getValue() == 21;
    }

}
