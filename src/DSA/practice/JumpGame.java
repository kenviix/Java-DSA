package DSA.practice;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr ={2,3,1,1,4};
        System.out.println(destination(arr));
    }
    static boolean destination(int[] arr){
        int gas = 0;
        for(int num : arr){
            if(gas<0){
                return false;
            }else if(num>gas){
                gas = num;
            }
            gas--;
        }
        return true;
    }
}
