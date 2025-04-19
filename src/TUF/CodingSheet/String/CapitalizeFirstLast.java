package TUF.CodingSheet.String;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        String str = "Take u Forward is Awesome";
        str = str.trim();
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0,Character.toUpperCase(str.charAt(0)));
        sb.setCharAt(str.length()-1,Character.toUpperCase(str.charAt(str.length()-1)));

        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i)==' '){
                sb.setCharAt(i-1,Character.toUpperCase(str.charAt(i-1)));
                sb.setCharAt(i+1,Character.toUpperCase(str.charAt(i+1)));
            }
        }

        System.out.println(sb);
    }
}
