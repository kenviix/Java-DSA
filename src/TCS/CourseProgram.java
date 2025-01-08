package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class CourseProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Course[] courses = new Course[4];
        for (int i = 0; i < courses.length; i++) {
            int courseId = in.nextInt();
            in.nextLine();
            String courseName = in.nextLine();
            String courseAdmin = in.nextLine();
            int quiz = in.nextInt();
            int handsOn = in.nextInt();
            courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handsOn);
        }
        in.nextLine();
        String admin = in.nextLine();
        int handsOn = in.nextInt();
        in.close();

        int avg = findAvgOfQuizByAdmin(courses, admin);
        if (avg == 0) {
            System.out.println("No Course found.");
        } else {
            System.out.println(avg);
        }

        Course[] sorted = sortCourseByHandsOn(courses, handsOn);
        if (sorted.length == 0) {
            System.out.println("No Course found with mentioned attribute.");
        } else {
            for (Course sort : sorted) {
                System.out.println(sort.getCourseName());
            }
        }

    }

    static int findAvgOfQuizByAdmin(Course[] courses, String admin) {
        int count = 0;
        int quiz = 0;
        for (Course course : courses) {
            if (course.getCourseAdmin().equalsIgnoreCase(admin)) {
                count++;
                quiz += course.getQuiz();
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return quiz / count;
        }

    }

    static Course[] sortCourseByHandsOn(Course[] courses, int handsOn) {
        Course[] sorted = new Course[0];
        for (Course course : courses) {
            if (course.getHandsOn() < handsOn) {
                sorted = Arrays.copyOf(sorted, sorted.length + 1);
                sorted[sorted.length - 1] = course;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j < sorted.length; j++) {
                if (sorted[i].getHandsOn() > sorted[j].getHandsOn()) {
                    Course temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        return sorted;
    }
}

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handsOn;

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandsOn() {
        return handsOn;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }
}
