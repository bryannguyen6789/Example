package Basic;

import java.util.Scanner;

public class BT04TinhGiaiThua {
    public static long tinhGiaiThua(int n) {
        if (n > 0) {
            return n * tinhGiaiThua(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri giai thua n = ");
        n = input.nextInt();
        System.out.println("Giai thua cua " +n+ " la:" + tinhGiaiThua(n));
    }
}
