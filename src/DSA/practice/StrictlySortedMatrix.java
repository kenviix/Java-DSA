package DSA.practice;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
    }
    static int[] binarySearch(int[][] matrix ,int row, int start, int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }else if(matrix[row][mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart , cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1 , cMid};
        }

        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);

        }
        

        return new int[]{-1,-1};
    }
}
