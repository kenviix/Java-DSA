package TCS;

/*

## Problem Statement

Create class Sim with below attributes:
id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.
This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above sequence along with a String search_circle and a double search_rate.
Then call the "matchAndSort" method and write logic in main method to print the id's of the result obtained.

## Input

    1
    jio
    430
    1.32
    mumbai
    2
    idea
    320
    2.26
    mumbai
    3
    airtel
    500
    2.54
    mumbai
    4
    vodafone
    640
    3.21
    mumbai
    mumbai
    3.4

## Output

    4
    3
    1
    2


 */

import java.util.Arrays;
import java.util.Scanner;

public class SimMatchAndSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sim[] sims = new Sim[4];
        for (int i = 0; i < sims.length; i++) {
            sims[i] = new Sim(in.nextInt(),in.next(),in.nextInt(),in.nextDouble(),in.next());
        }
        String searchCircle = in.next();
        double searchRate = in.nextDouble();
        Sim[] matchedSim = matchAndSort(sims,searchCircle,searchRate);
        for(Sim sim:matchedSim){
            System.out.println(sim.getId());
        }
    }

    static Sim[] matchAndSort(Sim[] sims,String searchCircle,double searchRate){
        Sim[] matchedSim = new Sim[0];
        for (Sim sim:sims){
            if(sim.getCircle().toLowerCase().equalsIgnoreCase(searchCircle) && sim.getRatePerSecond()<searchRate){
                matchedSim = Arrays.copyOf(matchedSim,matchedSim.length +1);
                matchedSim[matchedSim.length - 1] = sim;
            }
        }

        for (int i = 0; i < matchedSim.length; i++) {
            for (int j = 0; j < matchedSim.length; j++) {
                if(matchedSim[i].getBalance()>matchedSim[j].getBalance()){
                    Sim temp = matchedSim[i];
                    matchedSim[i] = matchedSim[j];
                    matchedSim[j] = temp;
                }
            }
        }
        return matchedSim;
    }
}

class Sim{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String  circle;

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
}