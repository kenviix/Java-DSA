import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;
        for (int i = num1; i < num2; i++) {
            sum += i * i * i;
            System.out.println(sum);
        }

    }
}