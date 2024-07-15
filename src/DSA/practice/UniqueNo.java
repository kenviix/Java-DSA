package DSA.practice;

public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(checkUnique(arr));
    }

    private static int checkUnique(int[] arr) {
        int unique = 0;
        for(int num: arr){
            unique ^= num;
        }
        return  unique;
    }
}
