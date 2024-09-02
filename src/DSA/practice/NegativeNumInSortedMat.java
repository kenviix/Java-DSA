package DSA.practice;

public class NegativeNumInSortedMat {
    public static void main(String[] args) {
        int[][] mat = {{5,1,0},{-5,-5,-5}};
        System.out.println(count(mat));
    }
    static int count(int[][] grid){

        int rows = grid.length;
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

        // the problem with this section is we dont know when to start new row

//        while(row <= grid.length && col < grid[0].length){
//            if(grid[row][col] >= 0 ){
//                col++;
//            }else{
//                count+= grid[row].length - col;
//                row++;
//                col = 0;
//            }
//        }

        return count;
    }
}
