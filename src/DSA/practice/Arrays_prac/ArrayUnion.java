// https://takeuforward.org/data-structure/union-of-two-sorted-arrays/

package DSA.practice.Arrays_prac;

import java.util.ArrayList;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr2 = {2,3,4,4,5,11,12};
        ArrayList<Integer> and = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();

        and(arr1,arr2,and);
        union(arr1,arr2,union);

//        System.out.println(and);
        System.out.println(union);
    }

    private static void and(int[] arr1,int[] arr2,ArrayList<Integer> ans){
        int i = 0;
        int j = 0;
        int minLen = Math.min(arr1.length, arr2.length);

        while (i<minLen && j<minLen){
            if(arr1[i] == arr2[j] && !ans.contains(arr1[i])){
                ans.add(arr1[i]);
            } else if (arr1[i] > arr2[j]) {
                j++;
            }else {
                i++;
            }
        }
    }

    private static void union(int[] arr1,int[] arr2,ArrayList<Integer> ans){
        int i = 0;
        int j = 0;
//        int minLen = Math.min(arr1.length, arr2.length);

        while (i< arr1.length && j< arr2.length){
            if(arr1[i] == arr2[j] && !ans.contains(arr1[i])){
                ans.add(arr1[i]);
                i++;
                j++;
            }else{
                if(arr1[i] < arr2[j] && !ans.contains(arr1[i])){
                    ans.add(arr1[i]);
                    i++;
                }else{
                    if(!ans.contains(arr2[j])){
                        ans.add(arr2[j]);
                    }
                    j++;
                }
            }

        }

        while(i < arr1.length){
            ans.add(arr1[i]);
            i++;
        }
        while(j< arr2.length){
            ans.add(arr2[j]);
            j++;
        }
    }

}
