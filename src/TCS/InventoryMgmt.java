package TCS;

/*

## Problem Statement

Create class Inventory with below attributes:
inventoryId - int
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit.
Then call the "replenish" method and write logic in main method to print "Critical Filling",if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print "Moderate Filling". Else print "Non-Critical Filling"

## Input

    1
    100
    50
    50
    2
    200
    60
    40
    3
    150
    35
    45
    4
    80
    45
    40
    45

## Output

    2 Non-Critical Filling
    3 Non-Critical Filling
    4 Non-Critical Filling


 */

import java.util.Arrays;
import java.util.Scanner;

public class InventoryMgmt {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Inventrory[] inventrories = new Inventrory[4];
        for (int i = 0; i < inventrories.length; i++) {
            inventrories[i] = new Inventrory(in.nextLine(),in.nextInt(),in.nextInt(),in.nextInt());
        }
        int limit = in.nextInt();
        in.close();
        Inventrory[] replenished = replenish(inventrories,limit);
        for (Inventrory replenish:replenished){
            if(replenish.getThreshold()>=75){
                System.out.println(replenish.getInventoryId() + "Critical fillings");
            } else if (replenish.getThreshold()>=50 && replenish.getThreshold()<75) {
                System.out.println(replenish.getInventoryId() +"Moderate filling");
            }else{
                System.out.println(replenish.getInventoryId() +"Non critical filling");
            }
        }
    }

    static Inventrory[] replenish(Inventrory[] inventrories,int limit){
        Inventrory[] newInventrory = new Inventrory[0];
        for (Inventrory inventrory:inventrories){
            if(inventrory.getThreshold()<=limit){
                newInventrory = Arrays.copyOf(newInventrory,newInventrory.length+1);
                newInventrory[newInventrory.length-1]  = inventrory;
            }
        }
        return newInventrory;
    }
}

class Inventrory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public String getInventoryId() {
        return inventoryId;
    }

    public int getThreshold() {
        return threshold;
    }

    public Inventrory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
}
