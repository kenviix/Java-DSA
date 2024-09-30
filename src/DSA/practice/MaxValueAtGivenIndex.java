package DSA.practice;

public class MaxValueAtGivenIndex {
    public static void main(String[] args) {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        System.out.println(maxValue(n,index,maxSum));
    }
//    static int maxValue(int n, int index, int maxSum) {
//        int left = 1, right = maxSum;
//
//        while (left < right) {
//            int mid = (left + right + 1) / 2;
//
//            if (getSum(index, mid, n) <= maxSum) {
//                left = mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return left;
//    }
//    static long getSum(int index, int value, int n) {
//        long count = 0;
//        if (value > index) {
//            count += (long) (value + value - index) * (index + 1) / 2;
//        } else {
//            count += (long) (value + 1) * value / 2 + index - value + 1;
//        }
//
//        if (value >= n - index) {
//            count += (long) (value + value - n + 1 + index) * (n - index) / 2;
//        } else {
//            count += (long) (value + 1) * value / 2 + n - index - value;
//        }
//
//        return count - value;
//    }

    static long maxValue(int n, int index, int maxSum) {
        long right = n - index - 1;
        long left = index;

        long start = 1;
        long end = maxSum;

        long ans = 0;

        while(start<=end){
            long mid = start + (end -start)/2;
            long sum = mid;
            long rs = 0;
            long ls = 0;
            long m= mid -1;

            if(right<=m){
                rs = m*(m+1)/2 - (m-right)*(m-right+1)/2;
            }else{
                rs = m*(m+1)/2 + (right-m);
            }

            if(left<=m){
                ls = m*(m+1)/2 - (m-left)*(m-left+1)/2;
            }else{
                ls = m*(m+1)/2 + (left-m);
            }

            sum += rs + ls;
            if(sum<=maxSum){
                ans = mid;
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }

        return  ans;
    }
}
