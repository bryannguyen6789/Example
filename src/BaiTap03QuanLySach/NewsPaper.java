package BaiTap03QuanLySach;

import java.util.Scanner;

public class NewsPaper extends Document {
    String dateIssue;

    public NewsPaper(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    public NewsPaper() {

    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: ");
        dateIssue = input.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; Ngay phat hanh: " + dateIssue);
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public boolean setDateIssue(String dateIssue) {
        if (dateIssue != null) {
            this.dateIssue = dateIssue;
            return true;
        } else {
            System.out.println("Vui long nhap lai ngay phat hanh: ");
            return false;
        }
    }
}
