package DSA.practice;

public class SquareRoot {
    public static void main(String[] args) {
       int x =9;
       System.out.println(FindRoot(x));

    }

     static int FindRoot(int x) {
         if (x == 0) {
             return 0;
         }
         int first = 1, last = x;
         while (first <= last) {
             int mid = first + (last - first) / 2;
             if (mid == x / mid) {
                 return mid;
             } else if (mid > x / mid) {
                 last = mid - 1;
             } else {
                 first = mid + 1;
             }
         }
         return last;
    }

}
