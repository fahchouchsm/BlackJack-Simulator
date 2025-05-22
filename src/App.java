import cards.Shoe;

public class App {
    public static void main(String[] args) throws Exception {
        Shoe shoe = new Shoe(8);
        System.out.println(shoe.getFirstCards(10));
    }
}
