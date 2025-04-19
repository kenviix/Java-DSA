package TUF.CodingSheet.NumberSystem;

public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "1100110";

//        Binary to Decimal

        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') *  (int) Math.pow(2,power);
            power++;
        }

//        Decimal to Octal

        int remainderMul=1;
        int octal=0;
        while(decimal>0){
            octal+=(decimal%8)*remainderMul;
           decimal/=8;
           remainderMul*=10;
        }
        System.out.println(octal);
    }
}
