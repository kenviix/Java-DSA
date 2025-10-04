// https://leetcode.com/problems/pascals-triangle/description/

package DSA.practice.Arrays_prac;

import java.util.ArrayList;
import java.util.List;

import static DSA.practice.BasicMaths.nCr;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 3;

//        System.out.println(value(5,3));
        System.out.println(getRow(5));
//        System.out.println(generate(rows));
    }

    // find value at given (row,col)
    // (r-1)C(n-1)
    private static int value(int r,int c){
        return nCr(r-1,c-1);
    }
    private static List<Integer> getRow(int r){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        r--;
        int col = 1;
        while (r>0){
            int prev = list.getLast();
            prev *= r;
            prev /= col;
            list.add(prev);
            col++;
            r--;
        }
        return  list;
    }

    // get full triangle
    private static List<List<Integer>> generate(int numRows) {
        int temp = numRows;
        List<List<Integer>> tri = new ArrayList<>();

        List<Integer> single = new ArrayList<>();
        single.add(1);
        tri.add(single);
        if (temp==1) {
            return tri;
        }
        numRows--;

        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        tri.add(two);
        if (temp==2) {
            return tri;
        }
        numRows--;
        System.out.println(numRows);

        while(numRows>0){
            int lastIndex = tri.size() - 1;
            List<Integer> list = tri.get(lastIndex);
            int listSize = tri.get(lastIndex).size();
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            int i = 0;
            int j = 1;

            while(j<listSize){
                newList.add(list.get(i)+list.get(j));
                i++;
                j++;
            }
            newList.add(1);
            tri.add(newList);
            numRows--;
        }

        return tri;
    }
}
