package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

public static void main(String[]args){

    // Ask how many users we want to add
        System.out.print("Enter number of students to enroll:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

    // Create n number of new students
        for(int n = 0; n < numOfStudents; n++){
                Student stu = new Student();
                stu.enroll();
                stu.payTuition();
                System.out.println(stu.showInfo());
                System.out.println("\n");

        }


        }
}