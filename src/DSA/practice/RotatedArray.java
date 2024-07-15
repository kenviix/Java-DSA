package DSA.practice;

import DSA.algorithms.BinarySearch;

public class RotatedArray {
    public static void main(String[] args) {
//        int[] num = {3, 4, 5, 6, 7, 0, 1, 2};
        int[] num = {3, 4, 5,6,6,6,6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(SearchTarget(num, target));

    }

    static int SearchTarget(int[] num, int target) {
        int pivot = FindPivot(num);
        if (pivot == -1) {
            return searchBinary(num, target, 0, num.length - 1);
        }
        if (num[pivot] == target) {
            return pivot;
        }
        if (target >= num[0]) {
            return searchBinary(num, target, 0, pivot - 1);
        }
        return searchBinary(num, target, pivot + 1, num.length - 1);

    }

    static int FindPivot(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && num[mid] > num[mid + 1]) {
                return mid;
            }
            if (mid > start && num[mid] < num[mid - 1]) {
                return mid - 1;
            }

            // this section won't work for duplicate elements

//            if (num[mid] <= num[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }

            // for duplicate elements

            if(num[mid] == num[start] && num[mid] == num[end]){
                if(num[start] > num[start+1]){
                    return start;
                }
                start++;

                if(num[end] < num[end-1]){
                    return  end - 1;
                }
                end--;
            } else if (num[start] < num[mid] || (num[start] == num[mid] && num[mid] > num[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int searchBinary(int[] num, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > num[mid]) {
                start = mid + 1;
            } else if (target < num[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
