package src;


import java.util.HashSet;
import java.util.TreeSet;

public class Hand {
    protected HashSet<Card> cards = new HashSet<Card>();

    public Hand() {
    }

    public Hand(HashSet<Card> c) {
        cards = c;
    }

    public HashSet<Card> addCard(Card c) {
        cards.add(c);
        return cards;
    }

    public TreeSet<Card> getCards() {
        // sorted list of cards
        TreeSet<Card> cardList = new TreeSet<Card>(cards);
        return cardList;
    }

    public int getScore() {
        int score = 0;
        int SPADES = 0;
        int HEARTS = 0;
        int CLUBS = 0;
        int DIAMONDS = 0;
        // find the score for each suit
        for (Card card : cards)
            switch (card.suit) {
                case 'S':
                    SPADES += card.getPoint();
                    break;
                case 'H':
                    HEARTS += card.getPoint();
                    break;
                case 'C':
                    CLUBS += card.getPoint();
                    break;
                case 'D':
                    DIAMONDS += card.getPoint();
                    break;
            }
        // find the highest scored suit
        score = SPADES;
        if (HEARTS > score)
            score = HEARTS;
        if (CLUBS > score)
            score = CLUBS;
        if (DIAMONDS > score)
            score = DIAMONDS;
        return score;
    }

    @Override
    public String toString() {
        String outputString = "";
        for (Card card : cards) {
            outputString = outputString + card + " ";
        }
        return outputString;
    } 
}