public class Card {
    // SPADES = S, HEARTS = H, DIAMONDS = D, CLUBS = C;
    protected char suit;
    protected int value;

    public Card(char s, int v) {
        suit = s;
        value = v;
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}