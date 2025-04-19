package TUF.CodingSheet.Arrays;

//Count frequency of each element in an array

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr ={10,5,10,15,10,5};
        boolean[] checker = new boolean[arr.length];
        countElements(arr,checker);
    }
    static void countElements(int[] arr,boolean[] visited){
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==true){
                continue;
            }
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
             if(arr[i] == arr[j]){
                 visited[j]=true;
                 count++;
             }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
