package TCS;

import java.util.Scanner;

public class CollegeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        College[] colleges = new College[4];
        for (int i = 0; i < colleges.length; i++) {
            int id = in.nextInt();
            in.nextLine();
            String name = in.nextLine();
            int contactNo = in.nextInt();
            in.nextLine();
            String address = in.nextLine();
            int pinCode = in.nextInt();
            colleges[i] = new College(id,name,contactNo,address,pinCode);
        }
        in.nextLine();
        String address = in.nextLine();

        College maxPin = findCollegeWithMaximumPincode(colleges);
        if(maxPin == null){
            System.out.println("No college found with mentioned attribute");
        }else{
            System.out.println("id-"+maxPin.getId());
            System.out.println("name-"+maxPin.getName());
            System.out.println("contact-"+maxPin.getContactNo());
            System.out.println("address-"+maxPin.getAddress());
            System.out.println("pincode-"+maxPin.getPinCode());
        }

        College colAddress = searchCollegeByAddress(colleges,address);
        if(colAddress == null){
            System.out.println("No college found with mentioned attribute");
        }else{
            System.out.println("id-"+colAddress.getId());
            System.out.println("name-"+colAddress.getName());
            System.out.println("contact-"+colAddress.getContactNo());
            System.out.println("address-"+colAddress.getAddress());
            System.out.println("pincode-"+colAddress.getPinCode());
        }

    }

    static College findCollegeWithMaximumPincode(College[] colleges){
        int max = Integer.MIN_VALUE;

        for (College college:colleges){
            if(college.getPinCode()>max){
                max = college.getPinCode();
            }
        }

        for (College college:colleges){
            if(college.getPinCode() == max){
                return college;
            }
        }

        return null;
    }

    static College searchCollegeByAddress(College[] colleges,String address){
        for (College college:colleges){
            if(college.getAddress().equalsIgnoreCase(address)){
                return college;
            }
        }
        return null;
    }
}

class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public College(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }
}

