package Basic;

public class Student {
        private String StudentID;
        private int studentYear;
        private float studentAVGMark;
        private String falcuty;

    public Student(int studentYear, String falcuty) {
        this.studentYear = studentYear;
        this.falcuty = falcuty;
    }

        public Student(String studentID, int studentYear, float studentAVGMark, String falcuty) {
                this(studentYear, falcuty);
                 this.StudentID = studentID;
//            this.studentYear = studentYear;
//            this.studentAVGMark = studentAVGMark;
//            this.falcuty = falcuty;
        }

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
        public void showInfo (int a, float b, String c,String[] strs){

        }
        public void showInfo (int a, float b, String c){

        }
}
