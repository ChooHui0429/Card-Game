package src;

public class Card implements Comparable<Card> {
    // SPADES = S, HEARTS = H, DIAMONDS = D, CLUBS = C;
    protected char suit;
    protected char face;
    protected int value;

    public Card(char s, char f) {
        // check suit input
        if (s != 'S' && s != 'H' && s != 'D' && s != 'C')
            throw new IllegalArgumentException(s + " is not a valid suit. Suits include S, H, D, C.");
        suit = s;
        // check face input
        if (f != 'A' && f != '2' && f != '3' && f != '4' && f != '5' && f != '6' && f != '7' && f != '8' && f != '9'
                && f != 'X' && f != 'J' && f != 'Q' && f != 'K')
            throw new IllegalArgumentException(f + " is not a valid face. Faces include A, 2 to 9, X(10), J, Q, K.");
        face = f;
        value = getValue(face);
    }

    public char getSuit() {
        return suit;
    }

    public int getFace() {
        return face;
    }

    public int getPoint() {
        if (value >= 10)
            return 10;
        else
            return value;
    }

    // private, used for internal calculations only
    private int getValue(char f) {
        // find the value for each face of the card
        switch (f) {
            case 'A':
                return 1;
            case 'X':
                return 10;
            case 'J':
                return 11;
            case 'Q':
                return 12;
            case 'K':
                return 13;
            default:
                return Character.getNumericValue(f);
        }
    }

    public int compareTo(Card card) {
        if (suit < card.suit)
            return -1;
        else if (suit > card.suit)
            return 1;
        else if (getValue(face) < getValue(card.face))
            return -1;
        else if (getValue(face) > getValue(card.face))
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "" + suit + face;
    }
}
