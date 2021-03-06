package src;

import java.util.LinkedList;
import java.util.Queue;

public class Player implements Comparable<Player> {
    protected String name;
    protected Queue<Hand> hands = new LinkedList<Hand>();
    protected int totalScore;

    public Player(String n) {
        name = n;
    }

    public Player(String n, Queue<Hand> h) {
        name = n;
        hands = h;
    }

    public void addHand(Hand h) {
        hands.add(h);
    }

    public Hand nextHand() {
        return hands.poll();
    }

    public int addScore(int newScore) {
        totalScore += newScore;
        return totalScore;
    }

    public void endRound() {
        hands.clear();
        totalScore = 0;
    }

    public int compareTo(Player player) {
        return name.compareTo(player.name);
    }

    @Override
    public String toString() {
        return name + ": " + hands.toString();
    }
}
