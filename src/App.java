import cards.Shoe;
import game.Game;
import user.Dealer;
import user.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Shoe shoe = new Shoe(8);
        Game game = new Game(shoe, new Player(100), new Dealer());
        System.out.println(game.getDealerHandString());
        System.out.println(game.getPlayerHandString());
    }
}
