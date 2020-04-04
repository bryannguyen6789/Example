package oop;

import java.util.Calendar;

public class Student extends Person {

    public double score;

//    public Student(String name, String ID, int year) {
//        super(name, ID, year);
//    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Score: " + this.getScore());
    }
}

