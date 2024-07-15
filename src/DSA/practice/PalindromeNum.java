package DSA.practice;

public class PalindromeNum {
    public static void main(String[] args) {
        int x =1001;
        System.out.println(isPalindrome(x));
    }
     static boolean isPalindrome(int x) {
//        String num = Integer.toString(x);
//        for(int i = 0;i<num.length()/2;i++){
//            char a = num.charAt(i), b =num.charAt(num.length()-1);
//            if(num.charAt(i)!=num.charAt(num.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
         if (x < 0) {
             return false;
         }

         int reverse = 0;
         int xcopy = x;

         while (x > 0) {
             reverse = (reverse * 10) + (x % 10);
             x /= 10;
         }

         return reverse == xcopy;
     }
}
