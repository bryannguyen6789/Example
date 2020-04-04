package Basic;

import java.util.Scanner;

public class NhapLieuBanPhim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so nguyen");
//        int a = scanner.nextInt();
//        System.out.println("Nhap vao 1 so thuc");
//        float floatValue = scanner.nextFloat();
//        System.out.println("nhap vao 1 so thuc khac");
//        double doubleValue = scanner.nextDouble();
//
//        System.out.println(a + "-" + floatValue + "-" + doubleValue);

        System.out.println("Nhap vao 1 ky tu: ");
        char c = scanner.next().charAt(0);
        System.out.println("Ban vua nhap" + c);
        System.out.println("Nhap vao 1 tu");
        String word = scanner.next();
        System.out.println("Ban vua nhap tu: " + word);
        scanner.nextLine();
        System.out.println("Nhap vao 1 dong: ");
        String line = scanner.nextLine();
        System.out.println("Ban vua nhap dong: " + line);
        System.out.println("nhap vao 1 gia tri True/False");
        boolean booleanValue = scanner.nextBoolean();

    }
}
