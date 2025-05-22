package user;

public class Player extends User {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public Player(float balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("- the balance connot be negative");
        }
        this.balance = balance;
    }
}
