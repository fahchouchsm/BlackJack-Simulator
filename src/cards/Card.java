package cards;

public class Card {
    private int value;
    private String face;

    public Card(int value, String face) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("- value must be between 1 and 13");
        }
        if (!face.equals("Spades") && !face.equals("Hearts") &&
                !face.equals("Diamonds") && !face.equals("Clubs")) {
            throw new IllegalArgumentException("- invalid face : " + face);
        }

        this.value = value;
        this.face = face;
    }

    public int getValue() {
        return value;
    }

    public String getFace() {
        return face;
    }

    public String toString() {
        return "value: " + value + "\t face: " + face + "\n";
    }
}
