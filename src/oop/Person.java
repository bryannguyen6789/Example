package oop;

import java.util.Calendar;

public class Person {
    public String name;

    public String ID;
    public int Year;


    public Person() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getAge() {
        int age = 0;
        Calendar now = Calendar.getInstance();
        age = now.get(Calendar.YEAR) - this.getYear();
        return age;
    }

    public void showInfo() {
        System.out.println("------------------------------");
        System.out.println("Info: ");
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.println("Birthday: " + this.getYear());
        System.out.println("Age: " + this.getAge());
    }
}
