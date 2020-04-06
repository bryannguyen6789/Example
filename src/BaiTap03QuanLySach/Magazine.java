package BaiTap03QuanLySach;

import java.util.Scanner;

public class Magazine extends Document {
    int numberIssue;
    int monthIssue;

    public Magazine(int numberIssue, int monthIssue) {
        this.numberIssue = numberIssue;
        this.monthIssue = monthIssue;
    }

    public Magazine() {

    }

    public int getNumberIssue() {
        return numberIssue;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        numberIssue = input.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        monthIssue = input.nextInt();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; So Phat Hanh: " + numberIssue + "; Thang Phat Hanh: " + monthIssue);
    }

    public boolean setNumberIssue(int numberIssue) {
        if (numberIssue > 0 ) {
            this.numberIssue = numberIssue;
            return true;
        }
        else {
            System.out.println("Vui long nhap lai so phat hanh");
            return false;
        }
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public boolean setMonthIssue(int monthIssue) {
        if (monthIssue > 0 && monthIssue <= 12 ) {
            this.monthIssue = monthIssue;
            return true;
        }
        else {
            System.out.println("Vui long nhap lai thang phat hanh");
            return false;
        }
    }
}
