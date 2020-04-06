package BaiTap02QLNhanVien;

import java.util.Scanner;

public class Worker extends Officer {
    public int level;

    public Worker(String name, String age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public Worker() {
        super();
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cap bac: ");
        while (true){
            int levelInput = input.nextInt();
            boolean check = setLevel(levelInput);
            if (check){
                break;
            }
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; Cap bac: " + level);
        System.out.println(" ");
    }

    public boolean setLevel(int level) {
        if (level >= 1 && level <= 10) {
            this.level = level;
            return true;
        } else {
            System.err.println("Vui long nhap lai level");
            return false;
        }
    }

    public int getLevel() {
        return level;
    }
}
