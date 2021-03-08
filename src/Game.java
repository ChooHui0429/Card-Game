package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Game {
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected int round = 0;
    protected LinkedList<Integer> deck = new LinkedList<Integer>();

    public Game() {
        // add cards to deck when initiated
        resetCards();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    // add cards back to deck
    private void resetCards() {
        deck.clear();
        Random rand = new Random();
        LinkedList<Integer> cardList = new LinkedList<Integer>();
        // add a list of cards by index
        for (int i = 0; i < 52; i++)
            cardList.add(i);
        while (cardList.size() > 0) {
            // generate a random deck index
            int r = rand.nextInt(cardList.size());
            // remove card in deck by random index
            int card = cardList.remove(r);
            // add removed card to deck
            deck.add(card);
        }
        // clear each players' hand
        for (Player player : players) {
            player.clearHand();
        }
    }

    // reshuffle cards in players' hands
    public void shuffle() {
        resetCards();
        dealCards();
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
                    // generate a random deck index
                    int randomDeckIndex = rand.nextInt(deck.size());
                    // remove card in deck by random index
                    int card = deck.remove(randomDeckIndex);
                    // add removed card to hand
                    hand.addCard(new Card(card));
                }
                handIndex++;
            }
        }
    }

    public Player getRoundWinner() {
        int topScorePlayer = 0, topScore = 0;
        // find the player with highest score
        for (int i = 0; i < players.size(); i++) {
            int playerScore = players.get(i).getHand().getScore();
            if (playerScore > topScore) {
                topScore = playerScore;
                topScorePlayer = i;
            }
        }
        if (topScore == 0)
            return null;
        else
            return players.get(topScorePlayer);
    }

    public Player getWinner() {
        int topScorePlayer = 0, topScore = 0;
        for (int i = 0; i < players.size(); i++) {
            int playerScore = players.get(i).totalScore;
            if (playerScore > topScore) {
                topScore = playerScore;
                topScorePlayer = i;
            }
        }
        return players.get(topScorePlayer);
    }

    // automatically determines whether to use tallyRound or nextPhase, can use the
    // methods manually as well
    public void next() {
        boolean isPhaseEnd = false;
        for (Player player : players) {
            if (player.getHand().cards.size() < 5)
                isPhaseEnd = true;
        }
        if (isPhaseEnd)
            nextPhase();
        else
            tallyRound();
    }

    public void tallyRound() {
        int topScorePlayer = 0, topScore = 0;
        // find the player with highest score
        for (int i = 0; i < players.size(); i++) {
            int playerScore = players.get(i).nextHand().getScore();
            if (playerScore > topScore) {
                topScore = playerScore;
                topScorePlayer = i;
            }
        }
        // add score to player with highest scoring hand
        players.get(topScorePlayer).addScore(topScore);
        // getRoundWinner().addScore(topScore);
        round++;
    }

    public void nextPhase() {
        round = 0;
        // find the player with lowest score
        int bottomScorePlayer = 0, bottomScore = 1000;
        for (int i = 0; i < players.size(); i++) {
            int playerScore = players.get(i).totalScore;
            if (playerScore < bottomScore) {
                bottomScore = playerScore;
                bottomScorePlayer = i;
            }
        }
        // remove player with lowest total score
        players.remove(bottomScorePlayer);
        resetCards();
        dealCards();
    }
}
