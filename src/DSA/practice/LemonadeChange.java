package DSA.practice;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] arr = {5,5,10,10,20};
        System.out.println(change(arr));
    }
    static boolean change(int[] arr){
        if(arr[0] != 5){
            return false;
        }
        int fives = 0;
        int tens = 0;

        for(int num : arr){
            if (num == 5){
                fives++;
            } else if (num == 10) {
               if(fives>0){
                   tens++;
                   fives--;
               }else {
                   return false;
               }
            }else{
                if(fives > 0 && tens>0){
                    fives--;
                    tens--;
                } else if (fives>2) {
                    fives-=3;
                }else{
                    return false;
                }
            }

        }
        return true;
    }
}
