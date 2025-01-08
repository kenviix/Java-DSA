package TCS;

/*

## Problem Statement

Create class Player with below attributes:
id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C"

## Input

    100
    Sachin
    5
    150
    13000
    101
    Sehwag
    4
    120
    10000
    103
    Dhoni
    7
    110
    7000
    104
    Kohli
    15
    57
    4400
    100

## Output

    Grade A
    Grade A
    Grade B


 */

import java.util.Arrays;
import java.util.Scanner;

public class PlayersAvgRuns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player[] players = new Player[4];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(in.nextInt(),in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        int target = in.nextInt();
        double[] avgRun = findAverageOfRuns(players,target);
        for (double run:avgRun){
            if(run>=80 && run<=100){
                System.out.println("Grade A");
            } else if (run<80 && run>= 50) {
                System.out.println("Grade B");
            }else{
                System.out.println("Grade C");
            }
        }
    }

    static double[] findAverageOfRuns(Player[] players,int target){
        double[] avgRun = new double[0];
        for(Player player:players){
            if(player.getMatchesPlayed() >= target){
                avgRun = Arrays.copyOf(avgRun,avgRun.length+1);
                avgRun[avgRun.length - 1] = (double) player.getRunsScored()/player.getMatchesPlayed();
            }
        }

        return avgRun;
    }
}

class Player{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public int getMatchesPlayed(){
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored){
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
}



