package game;

import cards.Shoe;
import user.Dealer;
import user.Player;

public class Game {
    private Shoe shoe;
    private Dealer dealer;
    private Player player;

    public Game(Shoe shoe, Player player, Dealer dealer) {
        this.shoe = shoe;
        this.dealer = dealer;
        this.player = player;
        start();
    }

    private void start() {
        dealInitCards();
        // TODO -
    }

    private void dealInitCards() {
        dealer.draw(shoe.draw());
        player.draw(shoe.draw());
        player.draw(shoe.draw());
    }

    public String getDealerHandString() {
        System.out.println("+ dealer hand :");
        return dealer.getCurrentHand().toString();
    }

    public String getPlayerHandString() {
        System.out.println("+ player hand :");
        return player.getCurrentHand().toString();
    }
}
