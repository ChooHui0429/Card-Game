package Src;

import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> cards;

    public Hand(ArrayList<Card> c) {
        cards = c;
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
                    SPADES += card.point;
                    break;
                case 'H':
                    HEARTS += card.point;
                    break;
                case 'C':
                    CLUBS += card.point;
                    break;
                case 'D':
                    DIAMONDS += card.point;
                    break;
            }
        // find the highest scored suit
        score = SPADES;
        if (HEARTS > SPADES)
            score = HEARTS;
        if (CLUBS > HEARTS)
            score = CLUBS;
        if (DIAMONDS > CLUBS)
            score = DIAMONDS;

        return score;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}