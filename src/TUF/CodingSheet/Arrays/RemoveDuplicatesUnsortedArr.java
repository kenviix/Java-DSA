package TUF.CodingSheet.Arrays;

public class RemoveDuplicatesUnsortedArr {
    public static void main(String[] args) {
        int[] arr = {2,3,1,9,3,1,3,9};
        removeDuplicate(arr);
    }
    static void removeDuplicate(int[] arr){

//        Brute force

//        int mark[] = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            mark[i] = 1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (mark[i] == 1) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        mark[j] = 0;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (mark[i] == 1) {
//                System.out.print(arr[i] + ",");
//            }
//        }



//        Hashmap

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(!map.containsKey(arr[i])){
//                System.out.println(arr[i]+" ");
//                map.put(arr[i],1 );
//            }
//        }
//        System.out.println(map);
    }
}
