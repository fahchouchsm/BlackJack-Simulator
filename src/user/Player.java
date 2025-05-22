package user;

import cards.Card;

public class Player extends User {
    private float balance;

    public void draw(Card c) {
        hand.addCard(c);
    }

    public float getBalance() {
        return balance;
    }
}
