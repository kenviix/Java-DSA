package DSA.practice;

public class CountNegNumMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row=0;
        int col = grid[0].length-1;
        int count = 0;
        while(row<rows && col>=0){
            if(grid[row][col] >=0){
                row++;
            }else{
                count += rows-row;
                col--;
            }
        }
        return count;
    }
}
