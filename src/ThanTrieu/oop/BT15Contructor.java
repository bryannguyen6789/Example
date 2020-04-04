package ThanTrieu.oop;

import Basic.Student;

import java.util.Scanner;

public class BT15Contructor {
    public static void main(String[] args) {
        //String studentID, int studentYear, float studentAVGMark, String falcuty)
        Student std = new Student("B1917", 3,3.12f, "Math");
        Scanner input = new Scanner(System.in);
        System.out.println("Student ID: " + std.getStudentID());
        System.out.println("Student Years: " + std.getStudentYear());
        System.out.println("Student AVGMark: " + std.getStudentAVGMark());
        System.out.println("Student Falcuty: " + std.getFalcuty());

        Student std2 = new Student("B2007", 3,2.45f, "CNTT");
        System.out.println("Student ID: " + std2.getStudentID());
        System.out.println("Student Years: " + std2.getStudentYear());
        System.out.println("Student AVGMark: " + std2.getStudentAVGMark());
        System.out.println("Student Falcuty: " + std2.getFalcuty());

    }
}
