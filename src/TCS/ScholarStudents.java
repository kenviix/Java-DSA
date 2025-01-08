package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class ScholarStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++) {
            int rollNo = in.nextInt();
            in.nextLine();
            String name = in.nextLine();
            String branch = in.nextLine();
            double score = in.nextDouble();
            boolean dayScholar = in.nextBoolean();
            students[i] = new Student(rollNo,name,branch,score,dayScholar);
        }
        in.close();

        int count = findCountOfDayscholarStudents(students);
        if(count == 0){
            System.out.println("There are no such dayscholar students");
        }else {
            System.out.println(count);
        }

        Student sorted = findStudentwithSecondHighestScore(students);
        if(sorted == null){
            System.out.println("There are no student from non day scholar");
        }else{
            System.out.print(sorted.getRollNo()+"#");
            System.out.print(sorted.getName()+"#");
            System.out.format("%.1f",sorted.getScore());
        }

    }

    static int findCountOfDayscholarStudents(Student[] students){
        int count = 0;
        for(Student student:students){
            if(student.isDayScholar() && student.getScore() > 80){
                count++;
            }
        }
        return  count;
    }

    static Student findStudentwithSecondHighestScore(Student[] students){
        Student[] sorted = new Student[0];
        for(Student student:students){
            if(!student.isDayScholar()){
                sorted = Arrays.copyOf(sorted,sorted.length + 1);
                sorted[sorted.length - 1] = student;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j < sorted.length; j++) {
                Student temp = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = temp;
            }
        }
        if(sorted.length <= 1){
            return null;
        }else {
            return sorted[1];
        }
    }
}

class Student{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getScore() {
        return score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }
}