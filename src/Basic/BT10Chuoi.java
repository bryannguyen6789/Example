package Basic;

import java.util.Scanner;

public class BT10Chuoi {
    public static void main(String[] args) {
//        String chuoi1;
//        int doDai;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap chuoi vao tu ban phim");
//        chuoi1 = input.nextLine();
//        doDai = chuoi1.length();
//        System.out.println("Chuoi " + chuoi1 + " co do dai la : " + doDai);
        String chuoi1 = "Happy", chuoi2 = "Star";
        String chuoi3 = chuoi1.concat(chuoi2);
        System.out.println(chuoi3);
        char C = chuoi3.charAt(5);
        System.out.println("Ky Tu thu 5 la: " + C);
        int result = chuoi1.compareTo(chuoi2);
        if (result == 0) {
            System.out.println("Chuoi: " + chuoi1 + " = " + chuoi2);
        } else if (result < 0) {
            System.out.println("Chuoi: " + chuoi1 + " > " + chuoi2);
        } else {
            System.out.println("Chuoi: " + chuoi1 + " < " + chuoi2);
        }

        System.out.println("Chuoi 1 sau khi duoc thay the la: " + chuoi1.replace("a","AA"));
    }
}
