package ThanTrieu.oop;

import Basic.Student;

public class BT16KhoiTaovaConTroThis {
    public static void main(String[] args) {
        Student std = new Student("C1907", 1, 3.14f, "CNTT");
        System.out.println("StudentID" + std.getStudentID());
        System.out.println("Student Mark" + std.getStudentAVGMark());
    }
}
