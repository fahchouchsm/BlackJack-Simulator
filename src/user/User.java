package user;

import cards.Card;

public abstract class User {
    protected Hand hand = new Hand();

    public int draw(Card c) {
        return hand.addCard(c);
    }

    public Hand getHand() {
        return hand;
    }

    public boolean isBlackJack() {
        return hand.getCards().size() == 2 && hand.getValue() == 21;
    }
}
