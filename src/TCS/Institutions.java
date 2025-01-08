package TCS;

/*

## Problem Statement

Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - findNumClearancedByLoc and updateInstitutionGrade in Solution class.

**findNumClearancedByLoc method:**
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter.
If no institution with the given location is present in the array of institution objects, then the method should return 0.

**updateInstitutionGrade method:**
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return null.

**The grade attribute should be calculated as follows:**
rating=(noOfStudentsPlaced \* 100)/noOfStudentsCleared
If the rating &gt= 80 , then grade should be 'A'.
Else, then grade should be 'B'

**Note:**
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is greater than 0, or it
should print "There are no cleared students in this particular location".

For updateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence (except grade attribute).
Next, read the value for location and institutionName.

## Input

    111
    Amrita
    5000
    10000
    Chennai
    222
    Karunya
    16000
    20000
    Coimbatore
    333
    AppleTech
    10000
    12000
    Chennai
    444
    Aruna
    6000
    10000
    Vellore
    Chennai
    Karunya

## Output

    22000
    Karunya::A

 */

import java.util.Scanner;

public class Institutions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Institution[] institutions = new Institution[4];
        for (int i = 0; i < institutions.length; i++) {
            institutions[i] = new Institution(in.nextInt(), in.next(), in.nextInt(), in.nextInt(), in.next());
        }
        String location = in.next();
        String institutionName = in.next();

        int locCleared = findNumClearancedByLoc(institutions, location);
        if (locCleared == 0) {
            System.out.println("here are no cleared students in this particular location");
        } else {
            System.out.println(locCleared);
        }
        Institution gradeCleared = updateInstitutionGrade(institutions, institutionName);
        if (gradeCleared == null) {
            System.out.println("No Institute is available with the specified name");
        } else {
            System.out.println(gradeCleared.getInstitutionName() + "::" + gradeCleared.getGrade());
        }

    }

    static int findNumClearancedByLoc(Institution[] institutions, String location) {
        int sum = 0;
        for (Institution institution : institutions) {
            if (institution.getLocation().toLowerCase().equalsIgnoreCase(location)) {
                sum += institution.getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    static Institution updateInstitutionGrade(Institution[] institutions, String institutionName) {
        for (Institution institution : institutions) {
            if (institution.getInstitutionName().toLowerCase().equalsIgnoreCase(institutionName)) {
                int rating = (institution.getNoOfStudentsPlaced() * 100) / institution.getNoOfStudentsCleared();
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }
        return null;
    }
}

class Institution {
    private int institution;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public int getInstitution() {
        return institution;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setInstitution(int institution) {
        this.institution = institution;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Institution(int institution, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {

        this.institution = institution;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }
}