package DSA.practice;



public class ShipCapacity {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(capacity(weights,days));
    }

    private static int capacity(int[] weights, int days) {
        int min = 1;
        int max = 0;
        for(int weight : weights){
            if(weight>max){
                max = weight;
            }
        }

        while(min<max){
            int mid = min + (max - min)/2;
            if(weightsShipped(weights, days,mid)){
                min = mid ;
            }else{
                max = mid +1;
            }
        }
        return min;
    }

    private static boolean weightsShipped(int[] weights, int days,int mid) {
        int start = 0;
        while(days>0){
            int sum = 0;
            while(start< weights.length){
                sum += weights[start];
                start++;
                if(sum>mid){
                    break;
                }
            }
            days--;
        }
        if(start<=weights.length){
            return true;
        }else{
            return false;
        }
    }

}
