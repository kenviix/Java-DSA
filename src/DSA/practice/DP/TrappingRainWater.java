package DSA.practice.DP;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
    private static int trappingRainWater(int[] height){
        int total = 0;
        int l = 0;
        int r = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];

        while (l<r){
            if(height[l]<=height[r]){
                if(leftMax>height[l]){
                    total+=leftMax-height[l];
                }else{
                    leftMax = height[l];
                }
                l +=1;
            }else{
                if(rightMax>height[r]){
                    total+=rightMax-height[r];
                }else {
                    rightMax=height[r];
                }
                r-=1;
            }
        }
        return total;
    }
}
