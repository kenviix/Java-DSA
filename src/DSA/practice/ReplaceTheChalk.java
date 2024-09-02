package DSA.practice;

public class ReplaceTheChalk {
    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;
        System.out.println(replace(chalk,k));

    }
    static int replace(int[] chalk,int k){
        long accSum = 0;
        for (int c : chalk) accSum += c;

        k %= accSum;

        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) return i;
            k -= chalk[i];
        }
        return -1;
    }
}
