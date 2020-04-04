package oop;

public class Main {
    public static void main(String[] args) {
        Person personObj = new Person();
//        personObj.showInfo();
        Student studentObj = new Student();
        studentObj.setName("Khoa");
        studentObj.setID("VFASD");
        studentObj.setYear(1989);
        studentObj.setScore(8.5);
        studentObj.showInfo();

        Teacher teacherObj = new Teacher();
        teacherObj.setName("MrPeter");
        teacherObj.setSalary(10000.13f);
        teacherObj.showInfo();


//        studentOne.name = "Nguyen Dai An";
//        studentOne.StudentID = "C4657";
//        studentOne.Year = 1994;
//        studentOne.showInfo();
//        studentOne.getAge();
//
//        System.out.println("--------------------------");
//        Student studentTwo = new Student();
//        studentTwo.name = "Nguyen Van B";
//        studentTwo.StudentID = "C1546";
//        studentTwo.Year = 1997;
//        studentTwo.showInfo();
//        studentOne.setStudentID("DB",4567);
//        System.out.println("ID: " + studentOne.getStudentID());

//        Teacher teacherOne = new Teacher();
    }
}
