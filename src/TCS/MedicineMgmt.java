package TCS;

/*

## Problem Statement

Create class Medicine with below attributes:
MedicineName - String
batch - String
disease - String
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class.
This method will take array of Medicine objects and a disease String as parameters.
And will return another sorted array of Integer objects where the disease String matches with the original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects referring the attributes in above sequence along with a String disease.
Then call the "getPriceByDisease" method and print the result.

## Input

    dolo650
    FAC124W
    fever
    100
    paracetamol
    PAC545B
    bodypain
    150
    almox
    ALM747S
    fever
    200
    aspirin
    ASP849Q
    flu
    250
    fever

## Output

    100
    200


 */

import java.util.Arrays;
import java.util.Scanner;

public class MedicineMgmt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for (int i = 0; i < medicines.length; i++) {
            medicines[i] = new Medicine(in.next(),in.next(),in.next(),in.nextInt());
        }
        String disease = in.next();
        in.close();
        int[] prices = getPriceByDisease(medicines,disease);
        for(int price:prices){
            System.out.println(price);
        }

    }
    static int[] getPriceByDisease(Medicine[] medicines,String disease){
        int[] prices = new int[0];
        for (Medicine medicine:medicines){
            if (medicine.getDisease().toLowerCase().equalsIgnoreCase(disease)){
                prices = Arrays.copyOf(prices,prices.length + 1);
                prices[prices.length - 1] = medicine.getPrice();
            }
        }
        return prices;
    }
}

class Medicine{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}
