package TUF.CodingSheet.Arrays;

//Replace elements by its rank in the array

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceByRank {
    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        System.out.println("before replace");
        System.out.println(Arrays.toString(arr));
        replace(arr);
        System.out.println("after replace");
        System.out.println(Arrays.toString(arr));
    }

    static void replace(int[] arr) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int position = 1;
        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, position);
                position++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=map.get(arr[i]);;
        }
    }
}
