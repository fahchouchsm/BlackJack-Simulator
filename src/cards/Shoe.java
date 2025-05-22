package cards;

public class Shoe {
    private int numDecks;

    public Shoe(int numDecks) {
        if (numDecks < 1 || numDecks > 100) {
            throw new IllegalArgumentException("numDecks must be between 1 and 10");
        }
        for (int d = 0; d < numDecks; d++) {
            new Deck();
        }

        this.numDecks = numDecks;
    }

    public int getNumCards() {
        return numDecks * 52;
    }
}
