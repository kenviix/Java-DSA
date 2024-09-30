package DSA.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        int target = 4;
        int index = 0;
        System.out.println(search(arr,target,index,new ArrayList<>()));;
    }
    static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
