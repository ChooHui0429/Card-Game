package src;

public class Card implements Comparable<Card> {
    // SPADES = S, HEARTS = H, DIAMONDS = D, CLUBS = C;
    protected char suit;
    // A to K
    protected char face;
    // 1 to 13
    protected int value;

    // uses index for easier cards generating
    public Card(int index) {
        // order: S H C D, A to K, from 0 to 51
        switch (index / 13) {
            case 0:
                suit = 'S';
                break;
            case 1:
                suit = 'H';
                break;
            case 2:
                suit = 'C';
                break;
            case 3:
                suit = 'D';
                break;
        }
        face = getFace(index % 13 + 1);
        value = getValue(face);
    }

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

    private char getFace(int value) {
        switch (value) {
            case 1:
                return 'A';
            case 10:
                return 'X';
            case 11:
                return 'J';
            case 12:
                return 'Q';
            case 13:
                return 'K';
            default:
                return (char) (value + '0');
        }
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
