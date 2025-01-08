package TCS;

/*

## Problem Statement

Create class Sim with below attributes:
simId - int
customerName - String
balance - double
ratePerSecond - double
circle - String

Create class Solution and implement static method "transferCircle" in the Solution class.
This method will take array of Sim objects, circle1 String and circle2 string as parameters.
And will return another Sim array where the circle1 matches with the circle parameter of the original Sim array and the circle parameter of the new array is set to circle2 and is also sorted by means of ratePerSecond attribute in desending order.

Write necessary getters and setters.

Before calling "transferCircle" method in the main method, read values for five Sim objects referring the attributes in above sequence along with a String circlee1 and circle2.
Then call the "transferCircle" method and write logic in main method to print all the attributes of the result obtained.

## Input

    1
    raju
    130
    1.32
    mum
    2
    sachin
    120
    2.26
    ahd
    3
    ram
    200
    2.54
    kol
    4
    shubham
    640
    3.21
    ahd
    5
    kalpesh
    150
    1.8
    ahd
    ahd
    kol

## Output

    4 shubham kol 3.21
    2 sachin kol 2.26
    5 kalpesh kol 1.8


 */

import java.util.Arrays;
import java.util.Scanner;

public class SimTransferCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sims[] sims = new Sims[5];
        for (int i = 0; i < sims.length; i++) {
            sims[i] = new Sims(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.next());
        }
        String circle1 = in.next();
        String circle2 = in.next();
        Sims[] sortedSims = transferCircle(sims,circle1,circle2);
        for (Sims sim:sortedSims){
            System.out.print(sim.getSimId()+" ");
            System.out.print(sim.getCustomerName()+" ");
            System.out.print(sim.getCircle()+" ");
            System.out.print(sim.getRatePerSecond()+" ");
            System.out.println();
        }
    }

    static Sims[] transferCircle(Sims[] sims,String circle1,String circle2){
        Sims[] sortedSims = new Sims[0];
        for(Sims sim:sims){
            if(sim.getCircle().toLowerCase().equalsIgnoreCase(circle1)){
                sim.setCircle(circle2);
                sortedSims = Arrays.copyOf(sortedSims,sortedSims.length + 1);
                sortedSims[sortedSims.length - 1] = sim;
            }
        }
        for (int i = 0; i < sortedSims.length; i++) {
            for (int j = 0; j < sortedSims.length; j++) {
                if(sortedSims[i].getRatePerSecond() > sortedSims[j].getRatePerSecond()){
                    Sims temp = sortedSims[i];
                    sortedSims[i] = sortedSims[j];
                    sortedSims[j] = temp;
                }
            }
        }
        return sortedSims;
    }

}

class Sims{
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public Sims(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
}
