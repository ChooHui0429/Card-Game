public class Card implements Comparable<Card> {
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

    public int compareTo(Card card) {
        if (suit < card.suit)
            return -1;
        else if (suit > card.suit)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return suit + Integer.toString(value);
    }
}
