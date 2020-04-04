package ThanTrieu.oop;

public class BT13HuongDoiTuong {
    public static void main(String[] args) {
        Person nguoi1, nguoi2;
        nguoi1 = new Person();
        nguoi2 = new Person();
        System.out.println(nguoi1.toString() + " " + nguoi2.toString());
    }

    static class Person {
        private String name;
        private String ID;
        private float salary;
        private String address;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public class Student {
        private String StudentID;
        private int studentYear;
        private float studentAVGMark;
        private String falcuty;

        public void goToSchool() {

        }

        public void study() {

        }

        public void doExam() {

        }
        public void Result(){

        }

        public String getStudentID() {
            return StudentID;
        }

        public void setStudentID(String studentID) {
            StudentID = studentID;
        }

        public int getStudentYear() {
            return studentYear;
        }

        public void setStudentYear(int studentYear) {
            this.studentYear = studentYear;
        }

        public float getStudentAVGMark() {
            return studentAVGMark;
        }

        public void setStudentAVGMark(float studentAVGMark) {
            this.studentAVGMark = studentAVGMark;
        }

        public String getFalcuty() {
            return falcuty;
        }

        public void setFalcuty(String falcuty) {
            this.falcuty = falcuty;
        }
    }
}
