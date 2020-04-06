package BaiTap02QLNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Engineer> engineerList = new ArrayList<>();
        ArrayList<Worker> workersList = new ArrayList<>();
        ArrayList<Staff> staffList = new ArrayList<>();
        int choose;
        Scanner input = new Scanner(System.in);
        ManageOfficer manageOfficer = new ManageOfficer();
        do {
            showMenu();
            System.out.println("Choose one: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap a de them Ky Su");
                    System.out.println("Nhap b de them Cong Nhan");
                    System.out.println("Nhap c de them Can bo");
                    String type = input.nextLine();
                    switch (type){
                        case "a":
                            int x;
                                System.out.println("Nhap so Ky Su can them: ");
                                x = Integer.parseInt(input.nextLine());
                                for (int i = 0; i < x; i++) {
                                    Engineer egn = new Engineer();
                                    egn.inputInfo();
                                    engineerList.add(egn);
                                }
                            break;
                        case "b":
                            int y;
                            System.out.println("Nhap so Cong Nhan can them: ");
                            y = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < y; i++) {
                                Worker wker = new Worker();
                                wker.inputInfo();
                                workersList.add(wker);
                            }
                            break;

                        case "c":
                            int z;
                            System.out.println("Nhap so Nhan Vien can them: ");
                            z =Integer.parseInt(input.nextLine());
                            for (int i = 0; i < z; i++) {
                                Staff stf = new Staff();
                                stf.inputInfo();
                                staffList.add(stf);
                            }
                            break;
                        default:
                            System.out.println("Vui long nhap vao 1 trong cac gia tri a, b, c");
                    }
                    break;
                case 2:
                    System.out.println("Nhap ten can tim kiem: ");
                    String egnNameSeach = input.nextLine();
                    String wkrNameSeach = input.nextLine();
                    String stfNameSeach = input.nextLine();
                    int count = 0;
                    for (Engineer egn: engineerList) {
                        if (egn.getName().equalsIgnoreCase(egnNameSeach)){
                            egn.showInfo();
                            count++;
                        }
                    }
                    for (Worker wkr: workersList) {
                        if (wkr.getName().equalsIgnoreCase(wkrNameSeach)){
                            wkr.showInfo();
                            count++;
                        }
                    }
                    for (Staff stf: staffList) {
                        if (stf.getName().equalsIgnoreCase(stfNameSeach)){
                            stf.showInfo();
                            count++;
                        }
                    }
                    if (count == 0 ){
                        System.out.println("Khong tim thay ten can bo");
                    }
                    break;
                case 3:
                    for (int i = 0; i < engineerList.size(); i++) {
                        engineerList.get(i).showInfo();
                    }
                    for (int i = 0; i < staffList.size(); i++) {
                        staffList.get(i).showInfo();
                    }
                    for (int i = 0; i < workersList.size(); i++) {
                        workersList.get(i).showInfo();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        } while (choose != 4);

    }

    public static void showMenu() {
        System.out.println("1. Them moi can bo");
        System.out.println("2. Tim kiem theo ho ten");
        System.out.println("3. Hien thi thong tin danh sach can bo");
        System.out.println("4. Thoat khoi chuong trinh ");
    }
}
