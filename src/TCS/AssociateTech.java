package TCS;

/*

Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

## Input

    101
    Alex
    Java
    15
    102
    Albert
    Unix
    20
    103
    Alferd
    Testing
    13
    104
    Alfa
    Java
    15
    105
    Almas
    Java
    29
    Java

## Output

    101
    104

*/

import java.util.Arrays;
import java.util.Scanner;

public class AssociateTech {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Associates[] associates = new Associates[size];
        for (int i = 0; i < associates.length; i++) {
            associates[i] = new Associates(in.nextInt(),in.next(),in.next(),in.nextInt());
        }
        String searchTech = in.next();
        in.close();
        Associates[] users = associatesForGivenTechnology(associates,searchTech);
        if (users.length==0){
            System.out.println("no associates with assigned technology");
        }else{
            for (int i = 0; i < users.length; i++) {
                System.out.println(users[i].getId());
            }
        }


    }
    static Associates[] associatesForGivenTechnology(Associates[] associates,String searchTech){
        Associates[] refined = new Associates[0];
        for (int i = 0; i < associates.length; i++) {
            if(associates[i].getTech().equals(searchTech) && associates[i].getExp()%5 == 0){
                refined = Arrays.copyOf(refined,refined.length+1);
                refined[refined.length-1] = associates[i];
            }
        }
        return refined;
    }
}

class Associates {
    private int id;
    private String name;
    private String tech;
    private int exp;

    public Associates(int id,String name,String tech,int exp){
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.exp = exp;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getTech(){
        return tech;
    }
    public int getExp(){
        return exp;
    }


}