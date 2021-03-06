package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Game {
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected int round = 0;
    protected HashSet<Integer> deck = new HashSet<Integer>();

    public Game() {
        // add cards to deck when initiated
        shuffle();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    // add cards back to deck
    public void shuffle() {
        for (int i = 0; i < 52; i++)
            deck.add(i);
    }

    public void dealCards() {
        Random rand = new Random();
        int handIndex = 0;
        Queue<Hand> hands = new LinkedList<Hand>();
        while (deck.size() > 0) {
            if (handIndex == 5) {
                // reach 5(number of cards in a hand), add hand to player and resets hand index
                handIndex = 0;
                for (Player player : players)
                    player.addHand(hands.poll());

            } else {
                if (handIndex == 0) {
                    hands.clear();
                    // create sets of hands by number of players
                    for (int j = 0; j < players.size(); j++)
                        hands.add(new Hand());
                }
                // go through set of hands
                for (Hand hand : hands) {
                    // stop dealing cards when deck is empty
                    if (deck.size() <= 0) {
                        for (Player player : players)
                            player.addHand(hands.poll());
                        break;
                    }
                    int randomCardIndex = rand.nextInt(deck.size());
                    int cardIndex = 0;
                    // find card in deck
                    for (int card : deck) {
                        if (randomCardIndex == cardIndex) {
                            deck.remove(card);
                            break;
                        }
                        cardIndex++;
                    }
                    // add card to hand
                    hand.cards.add(new Card(randomCardIndex));
                }
                handIndex++;
            }
        }
    }

    public void nextRound() {
        // TODO: next round method
    }

    public void nextPhase() {
        // TODO: next phase method
    }
}
