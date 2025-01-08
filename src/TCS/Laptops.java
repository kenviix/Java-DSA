package TCS;


import java.util.Arrays;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Laptop[] laptops = new Laptop[4];

        for (int i = 0; i < laptops.length; i++) {

            int laptopId = in.nextInt();
            in.nextLine();
            String brand = in.nextLine();
            String osType = in.nextLine();
            double price = in.nextDouble();
            int rating = in.nextInt();
            laptops[i] = new Laptop(laptopId, brand, osType, price, rating);
        }
        in.nextLine();
        String brand = in.nextLine();
        String os = in.nextLine();

        int count = countOfLaptopByBrand(laptops, brand);

        if (count == 0) {
            System.out.println("The given brand is not available");
        } else {
            System.out.println(count);
        }

        Laptop[] sorted = searchLaptopByOsType(laptops, os);

        if (sorted.length == 0) {
            System.out.println("The given os is not available");
        } else {
            for (Laptop sort : sorted) {
                System.out.println(sort.getLaptopId());
                System.out.println(sort.getRating());
            }

        }

    }

    static int countOfLaptopByBrand(Laptop[] laptops, String brand) {
        int count = 0;
        for (Laptop laptop : laptops) {
            if (brand.equalsIgnoreCase(laptop.getBrand()) && laptop.getRating() >= 3) {
                count++;
            }
        }
        return count;
    }

    static Laptop[] searchLaptopByOsType (Laptop[] laptops,String os)
    {

        Laptop[] sorted = new Laptop[0];

        for (Laptop laptop : laptops) {
            if (os.equalsIgnoreCase(laptop.getOs())) {
                sorted = Arrays.copyOf(sorted, sorted.length + 1);
                sorted[sorted.length - 1] = laptop;
            }
        }

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j < sorted.length; j++) {
                if (sorted[i].getLaptopId() < sorted[j].getLaptopId()) {
                    Laptop temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}

class Laptop {
    int laptopId;
    String brand;
    String osType;
    double price;
    int rating;

    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public int getRating() {
        return rating;
    }

    public String getOs() {
        return osType;
    }

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }
}
