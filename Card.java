public class Card {
    // SPADES = S, HEARTS = H, DIAMONDS = D, CLUBS = C;
    protected char suit;
    protected int value;

    public Card(char s, int v) {
        if (s != 'S' && s != 'H' && s != 'D' && s != 'C')
            throw new IllegalArgumentException(s + " is not a valid suit. Suits include S, H, D, C.");
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
