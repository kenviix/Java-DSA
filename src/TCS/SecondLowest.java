package TCS;

import java.util.Scanner;

public class SecondLowest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        for (int i = 0; i < employees.length; i++) {
            int employeeId = in.nextInt();
            in.nextLine();
            String employeeName = in.nextLine();
            int age = in.nextInt();
            char gender = in.next().charAt(0);
            double salary = in.nextDouble();
            employees[i] = new Employee(employeeId,employeeName,age,gender,salary);
        }
        int age = in.nextInt();
        in.close();

        Employee secLowest = getEmployeeWithSecondLowestSalary(employees);
        if(secLowest == null){
            System.out.println("Null");
        }else{
            System.out.println(secLowest.getEmployeeId() + "#" + secLowest.getEmployeeName());
        }

        int count = countEmployeesBasedOnAge(employees,age);
        if(count==0){
            System.out.println("No employee found for the given age");
        }else{
            System.out.println(count);
        }
    }
    static Employee getEmployeeWithSecondLowestSalary(Employee[] employees){

        for (int i = 0; i < employees.length; i++) {
            for (int j = i; j < employees.length; j++) {
                if(employees[i].getSalary()>employees[j].getSalary()){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees[1];
    }

    static int countEmployeesBasedOnAge(Employee[] employees,int age){
        int count = 0;
        for(Employee employee:employees){
            if(employee.getAge() == age){
                count++;
            }
        }
        return count;
    }
}

class Employee{
     int employeeId;
     String employeeName;
     int age;
     char gender;
     double salary;

    public double getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Employee(int employeeId, String employeeName, int age, char gender, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}
