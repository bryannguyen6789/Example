package Basic;

import java.util.Scanner;

public class BT08TongCacChuSo {
    public static int tinhTong(int i) {
        int Tong = 0;
        int n;
        while (i != 0) {
            n = i % 10;
            Tong += n;
            i /= 10;
        }
        return (Tong);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen duong n =");
        n = input.nextInt();
        System.out.println("Tong cac chu so cua " + n + " la:" + tinhTong(n));
    }
}
