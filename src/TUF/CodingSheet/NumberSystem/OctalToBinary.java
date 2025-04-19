package TUF.CodingSheet.NumberSystem;

public class OctalToBinary {
    public static void main(String[] args) {
        int octal = 345;

        int decimal = 0;
        int power = 0;

        while(octal>0){
            decimal+=(octal%10)*(int)Math.pow(8,power);
            octal/=10;
            power++;
        }

        int binary=0;
        int remainderMul = 1;
        while (decimal>0){
             binary += (decimal%2)*remainderMul ;
            decimal/=2;
            remainderMul*=10;
        }
        System.out.println(binary);
    }
}
