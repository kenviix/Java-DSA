package DSA.practice;

public class CountInRotatedArray {
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 6, 6, 6, 8, 0, 1, 2};
        int pivot = FindPivot(num);
        System.out.println(pivot + 1);
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
}
