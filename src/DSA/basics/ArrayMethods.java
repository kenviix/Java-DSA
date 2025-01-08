package DSA.basics;

import java.util.Arrays;

/*

compare()	Compares two arrays
copyOf()	Creates a copy of an array with a new length
deepEquals()	Compares two multidimensional arrays to check whether they are deeply equal to each other
equals()	Checks if two arays are equal
fill()	Fills an array with a specified value
mismatch()	Returns the index position of the first mismatch/conflict between two arrays
sort()	Sorts an array in ascending order

 */

public class ArrayMethods {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};
        String[] cars3 = {"Audi", "BMW", "Tesla","mercedes"};
        String[][] fruits = {{"apple","orange","banana"},
                {"melon","grapes","mango"}};
        String[][] fruits2 = {{"apple","orange","banana"},
                {"melon","grapes","mango"}};
        String[][] fruits3 = {{"apple","orange","banana"},
                {"melon","grapes","kiwi"}};

//        System.out.println(Arrays.compare(cars, cars2));
//        System.out.println(Arrays.compare(cars, cars3));
//        String[] copy = Arrays.copyOf(cars,cars.length + 1);
//        System.out.println(Arrays.toString(copy));
//        System.out.println(Arrays.deepEquals(fruits,fruits2));
//        System.out.println(Arrays.deepEquals(fruits,fruits3));
//        System.out.println(Arrays.equals(cars,cars2));
//        System.out.println(Arrays.equals(cars,cars3));
//        Arrays.fill(cars3,2,4,"Porche");
//        System.out.println(Arrays.toString(cars3));
//        System.out.println(Arrays.mismatch(cars,cars2));
//        System.out.println(Arrays.mismatch(cars,cars3));
//        Arrays.sort(cars);
//        System.out.println(Arrays.toString(cars));
    }
}
