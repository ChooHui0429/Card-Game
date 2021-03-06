package src;

import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> cards = new ArrayList<Card>();

    public Hand() {
    }

    public Hand(ArrayList<Card> c) {
        cards = c;
    }

    public ArrayList<Card> addCard(Card c) {
        cards.add(c);
        return cards;
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
        String outputString = cards.get(0).toString();
        for (int i = 1; i < cards.size(); i++) {
            outputString = outputString + " " + cards.get(i);
        }
        return outputString;
    }
}