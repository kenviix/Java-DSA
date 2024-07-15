package DSA.practice;

public class RichestMan {
    public static void main(String[] args) {
        int[][] account = {
                {2,7,7},
                {6,4,2},
                {32,1,0}
        };
        System.out.println(findHighestWealth(account));
    }

     static int findHighestWealth(int[][] account) {
        int maxSum = 0;
        for(int[] row : account){
            int sum = 0;
            for(int col:row){
                sum+=col;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return  maxSum;
    }


}
