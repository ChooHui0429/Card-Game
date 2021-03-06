package src;

import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        // TODO: fix 2 player phase players are not dealt the 2 extra cards
        // TODO: low priority: null pointer after the second phase ends
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        String p1Name, p2Name, p3Name;
        System.out.println("Enter player 1 name: ");
        p1Name = input.nextLine();
        System.out.println("Enter player 2 name: ");
        p2Name = input.nextLine();
        System.out.println("Enter player 3 name: ");
        p3Name = input.nextLine();
        // System.out.println("Enter player 4 name: ");
        // p4Name = input.nextLine();
        Player p1 = new Player(p1Name);
        Player p2 = new Player(p2Name);
        Player p3 = new Player(p3Name);
        // Player p4 = new Player(p4Name);
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        // game.addPlayer(p4);
        game.dealCards();
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        game.shuffle();
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        // runs game.nextPhase()
        game.next();
        // 2p phase
        System.out.println("PHASE 2 STARTS");
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        // end
        System.out.println("Winner: " + game.getWinner().name);
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.nextLine();
        for (int i = 0; i < game.players.size(); i++) {
            Hand h = game.players.get(i).getHand();
            System.out.print(game.players.get(i).name + ": " + h + " | Point = " + h.getScore());
            if (game.getRoundWinner().equals(game.players.get(i)))
                System.out.print(" | Win");
            System.out.println();
        }
        game.next();
        for (int i = 0; i < game.players.size(); i++) {
            Player p = game.players.get(i);
            System.out.println(p.name + " = " + p.totalScore);
        }
        for (int i = 0; i < game.players.size(); i++) {
            System.out.println(game.players.get(i));
        }
        input.close();

    }
}
