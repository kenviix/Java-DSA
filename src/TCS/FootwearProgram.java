package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class FootwearProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Footwear[] footwears = new Footwear[5];
        for (int i = 0; i < footwears.length; i++) {
            int footwearId = in.nextInt();
            in.nextLine();
            String footwearName = in.nextLine();
            String footwearType = in.nextLine();
            int price = in.nextInt();
            footwears[i] = new Footwear(footwearId,footwearName,footwearType,price);
        }
        in.nextLine();
        String type = in.nextLine();
        String name = in.nextLine();
        in.close();

        int count = getCountByType(footwears,type);
        if(count == 0){
            System.out.println("Footwear not available");
        }else {
            System.out.println(count);
        }

        Footwear secHighest = getSecondHighestPriceByBrand(footwears,name);
        if (secHighest == null){
            System.out.println("Brand not available");
        }else {
            System.out.println(secHighest.getFootwearId());
            System.out.println(secHighest.getFootwearName());
            System.out.println(secHighest.getPrice());
        }

    }

    static int getCountByType(Footwear[] footwears,String type){
        int count = 0;
        for(Footwear footwear:footwears){

            if(footwear.getFootwearType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }

    static Footwear getSecondHighestPriceByBrand(Footwear[] footwears,String name){
        Footwear[] sorted = new Footwear[0];
        for (Footwear footwear:footwears){
            if(footwear.getFootwearName().equalsIgnoreCase(name)){
                sorted = Arrays.copyOf(sorted,sorted.length + 1);
                sorted[sorted.length - 1] = footwear;
            }
        }

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j < sorted.length; j++) {
                if (sorted[i].getPrice() < sorted[j].getPrice()){
                    Footwear temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        if(sorted.length <= 1){
            return null;
        }else {
            return sorted[1];
        }
    }
}

class Footwear{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }
}
