package BaiTap02QLNhanVien;

import java.util.Scanner;

public class Staff extends Officer {
    String job;

    public Staff(String name, String age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public Staff(){
        super();
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cong viec");
        while (true){
            String jobInput = input.nextLine();
            boolean check = setJob(jobInput);
            if (check){
                break;
            }
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; Cong viec: " + job);
        System.out.println(" ");
    }

    public String getJob() {
        return job;
    }

    public boolean setJob(String job) {
        if (job != null) {
            this.job = job;
            return true;
        } else {
            System.out.println("Nhap lai cong viec: ");
            return false;
        }
    }
}
