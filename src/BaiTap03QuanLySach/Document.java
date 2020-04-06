package BaiTap03QuanLySach;

import java.util.Scanner;

public class Document {
    String id;
    String nxb;
    int number;

    public Document(String id, String nxb, int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    public Document(){

    }

    public void inputInfo(){
        System.out.println("---------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma: ");
        id = input.nextLine();
        System.out.println("Nhap ten NXB: ");
        nxb = input.nextLine();
        System.out.println("Nhap So Ban Phat Hanh: ");
        number = input.nextInt();
    }

    public void showInfo(){
        System.out.println("--------------Book Info---------------");
        System.out.println("ID: " + id + " ; NXB: " + nxb + " ; So ban Phat Hanh: " + number);
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
