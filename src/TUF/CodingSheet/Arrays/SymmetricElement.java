package TUF.CodingSheet.Arrays;

//Find all Symmetric Pairs in the array of pairs

import java.util.HashMap;

public class SymmetricElement {
    public static void main(String[] args) {
        int[][] arr ={{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        similarElements(arr);
    }
    static void similarElements(int[][] arr){

//        brute force

//        boolean[] visited = new boolean[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if(visited[i]){
//                continue;
//            }
//            for (int j = 0; j < arr.length; j++) {
//                if(i!=j && ((arr[i][0]==arr[j][0] && arr[i][1]==arr[j][1]) | (arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]))){
//                    visited[i]=true ;
//                    visited[j]=true;
//                    System.out.println(arr[i][0]+","+arr[i][1]+" "+arr[j][0]+","+arr[j][1]);
//                    System.out.println();
//                }
//            }
//        }


//        hashmap

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.get(second)!=null && map.get(second)==first){
                System.out.println(first+","+second);
            }else{
                map.put(first,second);
            }
        }
    }
}
