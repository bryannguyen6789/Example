package BaiTap02QLNhanVien;

import java.util.Scanner;

public class Engineer extends Officer {
    String field;

    public Engineer(String name, String age, String gender, String address, String field) {
        super(name, age, gender, address);
        this.field = field;
    }

    public Engineer() {
        super();
    }


    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuyen nganh: ");
        while (true){
            String fieldInput = input.nextLine();
            boolean check = setField(fieldInput);
            if (check){
                break;
            }
        }

    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; Chuyen nganh: " + field);
        System.out.println(" ");
    }

    public String getField() {
        return field;
    }

    public boolean setField(String field) {
        if(field != null) {
            this.field = field;
            return true;
        }
        else {
            System.out.println("Vui long nhap lai chuyen nganh: ");
            return false;
        }
    }
}
