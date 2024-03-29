package src;

import java.util.LinkedList;
import java.util.Queue;

public class Player implements Comparable<Player> {
    protected String name;
    protected Queue<Hand> hands = new LinkedList<Hand>();
    protected int totalScore = 0;

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

    public Hand getHand() {
        return hands.peek();
    }

    public Hand nextHand() {
        return hands.poll();
    }

    public int addScore(int newScore) {
        totalScore += newScore;
        return totalScore;
    }

    public void clearHand() {
        hands.clear();
    }

    public int compareTo(Player player) {
        return name.compareTo(player.name);
    }

    @Override
    public String toString() {
        return name + ": " + hands.toString();
    }
}
