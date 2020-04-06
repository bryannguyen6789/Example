package BaiTap03QuanLySach;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageDocument {
    public static void main(String[] args) {
        ArrayList<Magazine> magazineList = new ArrayList<>();
        ArrayList<Book> booksList = new ArrayList<>();
        ArrayList<NewsPaper> newsPaperList = new ArrayList<>();
        int choose;
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("choose one: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    String n;
                    System.out.println("Nhap a de them Sach");
                    System.out.println("Nhap b de them Tap Chi");
                    System.out.println("Nhap c de them Bao");
                    n = input.nextLine();
                    switch (n) {
                        case "a":
                            int x;
                            System.out.println("Nhap so luong Sach can them");
                            x = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < x; i++) {
                                Book bk = new Book();
                                bk.inputInfo();
                                booksList.add(bk);
                            }
                            break;
                        case "b":
                            int y;
                            System.out.println("Nhap so luong Tap Chi can them");
                            y = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < y; i++) {
                                Magazine mgz = new Magazine();
                                mgz.inputInfo();
                                magazineList.add(mgz);
                            }
                            break;
                        case "c":
                            int z;
                            System.out.println("Nhap so luong Bao can them");
                            z = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < z; i++) {
                                NewsPaper np = new NewsPaper();
                                np.inputInfo();
                                newsPaperList.add(np);
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nhap ID tai lieu can xoa");
                    String idtailieu = input.nextLine();
                    for (int i = 0; i < booksList.size(); i++) {
                        if (booksList.get(i).id == idtailieu)
                        booksList.remove(booksList.get(i));
                    }
//                    booksList.remove(input.nextLine());
//                    newsPaperList.remove(input.nextLine());
//                    magazineList.remove(input.nextLine());
                    break;
                case 3:
                    System.out.println("Thong tin ve tai lieu da nhap la: ");
                    for (int i = 0; i < booksList.size(); i++) {
                        booksList.get(i).showInfo();
                    }
                    for (int i = 0; i < newsPaperList.size(); i++) {
                        newsPaperList.get(i).showInfo();
                    }
                    for (int i = 0; i < magazineList.size(); i++) {
                        magazineList.get(i).showInfo();
                    }
                    break;
                case 4:
                    System.out.println("Nhap ma tai lieu can tim kiem");
                    String bkSearch = input.nextLine();
                    String mgzSearch = input.nextLine();
                    String npSeach = input.nextLine();
                    int count = 0;
                    for (Book bk : booksList) {
                        if (bk.getid().equalsIgnoreCase(bkSearch)) {
                            bk.showInfo();
                            count++;
                        }
                    }
                    for (Magazine mgz: magazineList) {
                        if (mgz.getid().equalsIgnoreCase(mgzSearch)){
                            mgz.showInfo();
                            count++;
                        }
                    }
                    for (NewsPaper np: newsPaperList) {
                        if (np.getid().equalsIgnoreCase(npSeach)){
                            np.showInfo();
                            count++;
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }


        } while (choose != 5);


    }


    public static void showMenu() {
        System.out.println("---------------------------");
        System.out.println("1. Them moi tai lieu");
        System.out.println("2. Xoa tai lieu theo ma tai lieu");
        System.out.println("3. Hien thi thong tin ve tai lieu");
        System.out.println("4. Tim kiem tai lieu theo loai: Sach, bao, tap chi");
        System.out.println("5. Thoat khoi chuong trinh");

    }
}
