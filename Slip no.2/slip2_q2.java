import java.io.*;
import java.util.*;

import java.util.Arrays;

class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
    }

    public double getBattingAverage() {
        if (noOfInnings - noOfTimesNotOut > 0) {
            return (double) totalRuns / (noOfInnings - noOfTimesNotOut);
        }
        return 0.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Batting Average: " + getBattingAverage();
    }

    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (player1, player2) -> {
            double avg1 = player1.getBattingAverage();
            double avg2 = player2.getBattingAverage();
            return Double.compare(avg1, avg2);
        });
    }
}


 public class slip2_q2 {
    public static void main(String[] args) {
        // Create an array of CricketPlayer objects
        CricketPlayer[] players = new CricketPlayer[5];
        players[0] = new CricketPlayer("Rohit", 20, 3, 800);
        players[1] = new CricketPlayer("Rahul", 25, 2, 1200);
        players[2] = new CricketPlayer("Virat", 15, 1, 500);
        players[3] = new CricketPlayer("Yash", 30, 5, 1500);
        players[4] = new CricketPlayer("Harsh", 10, 0, 250);

        // Calculate and display the batting average for each player
        for (CricketPlayer player : players) {
            System.out.println(player);
        }

        // Sort the array based on batting average
        CricketPlayer.sort(players);

        // Display the player details in sorted order
        System.out.println("\nPlayer details in sorted order:");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }
    }
}


