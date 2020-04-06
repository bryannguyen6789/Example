package BaiTap03QuanLySach;

import java.util.Scanner;

public class Book extends Document {
    String Author;
    int pageNumber;

    public Book(String author, int pageNumber) {
        Author = author;
        this.pageNumber = pageNumber;
    }

    public Book() {
        super();
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Tac Gia: ");
        Author = input.nextLine();
        System.out.println("Nhap so trang: ");
        pageNumber = input.nextInt();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; Tac Gia: " + Author + "; So Trang : " + pageNumber );
        System.out.println("");
    }

    public String getAuthor() {
        return this.Author;
    }

    public boolean setAuthor(String author) {
        if (Author != null) {
            this.Author = author;
            return true;
        }
        else {
            System.out.println("Vui long nhap lai ten Tac Gia");
            return false;
        }
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public boolean setPageNumber(int pageNumber) {
        if(pageNumber >= 0) {
            this.pageNumber = pageNumber;
            return true;
        }
        else
        {
            System.out.println("Vui long nhap lai so trang ");
            return false;
        }
    }
}
