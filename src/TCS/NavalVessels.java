package TCS;

/*

## Problem Statement

Create a class NavalVessel with the below attributes:\
vesselld – int\
vesselName – String\
noOfVoyagesPlanned – int\
noOfVoyagesCompleted – int\
purpose – String\
classification – String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade in Solution class.

**findAvgVoyagesByPct method:**

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement as mentioned below.The percentage for each navalVessel is calculated as percentage .(noOfVoyagesCompleted \* 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are no objects with the mentioned criteria, then the method should return 0.

**findVesselByGrade method:**

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object.
Before returning the object, the classification should be derived as mentioned below. This classification value should be assigned to the object before returning. If any of the above conditions are not met, then the method should return null.
The classification attribute should be calculated based on the percentage calculation mentioned above. If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer otherwise the classification should be ‘Striver’
If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for percentage and purpose.

## Input

    111
    Rojer
    100
    100
    Passenger
    222
    Kalam
    200
    100
    Goods
    333
    Yashwin
    400
    300
    Army
    444
    Thanishwini
    500
    500
    Welfare
    75
    Army

## Output

    300
    Yashwin%Inspirer


 */

import java.util.Scanner;

public class NavalVessels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NavalVessel[] vessels = new NavalVessel[4];
        for (int i = 0; i < vessels.length; i++) {
            vessels[i] = new NavalVessel(in.nextInt(),in.next(),in.nextInt(),in.nextInt(),in.next());
        }
        int percentage = in.nextInt();
        String purpose = in.next();
        in.close();
        int avg = findAvgVoyagesByPct(vessels,percentage);
        System.out.println(avg);
        NavalVessel vesselByGrade = findVesselByGrade(vessels,purpose);
        if (vesselByGrade == null) {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }else {
            System.out.println(vesselByGrade.getVesselName()+"%"+vesselByGrade.getClassification());
        }
    }

    static int findAvgVoyagesByPct(NavalVessel[] vessels,int percentage){
        int avg = 0;
        int sum = 0;
        int count = 1;

        for(NavalVessel vessel:vessels){
            int percentObtained = (vessel.getNoOfVoyagesCompleted() * 100)/vessel.getNoOfVoyagePlanned();
            if(percentObtained >= percentage){
                sum += vessel.getNoOfVoyagesCompleted();
                avg = sum/count;
                count++;
            }
        }

        return avg;
    }

    static NavalVessel findVesselByGrade(NavalVessel[] vessels,String purpose){
        for (NavalVessel vessel:vessels){
            if(vessel.getPurpose().toLowerCase().equalsIgnoreCase(purpose)){
                int percentObtained = (vessel.getNoOfVoyagesCompleted() * 100)/vessel.getNoOfVoyagePlanned();
                if(percentObtained == 100){
                    vessel.setClassification("Star");
                } else if (percentObtained < 100 && percentObtained >=80) {
                    vessel.setClassification("Leader");
                } else if ((percentObtained < 80 && percentObtained >=55)){
                    vessel.setClassification("Inspirer");
                }else{
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null;
    }
}

class NavalVessel{
    private int vesselId;
    private String vesselName;
    private int noOfVoyagePlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public int getNoOfVoyagePlanned() {
        return noOfVoyagePlanned;
    }

    public String getPurpose(){
        return purpose;
    }

    public String getVesselName() {
        return vesselName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagePlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagePlanned = noOfVoyagePlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }
}

