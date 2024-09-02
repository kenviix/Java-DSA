package DSA.practice;

public class  ExcelColumnName {
    public static void main(String[] args) {
        int columnNumber = 98345789;
        System.out.println(convertToTitle(columnNumber));
    }
    static String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0)
        {
            columnNumber--;
            str=(char) ((columnNumber)%26+'A')+str;
            columnNumber/=26;
        }
        return str;
    }
}
