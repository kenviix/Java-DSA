package DSA.practice;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(time(piles,h));
    }

    static int time(int[] piles,int h){
        int minSpeed = 1;
        int maxSpeed = 0;

        for(int pile:piles){
            if(maxSpeed<pile){
                maxSpeed = pile;
            }
        }

        while(minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEat(piles, h, mid)) {
                maxSpeed = mid;
            }else{
                minSpeed = mid +1;
            }
        }
        return minSpeed;
    }

    static boolean canEat(int[] piles,int h,int speed){
        int hours = 0;
        for(int pile:piles){
            hours+=(int)Math.ceil((double) pile/speed);
        }
        return hours <= h;
    }
}
