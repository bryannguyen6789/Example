package Basic;

import java.util.Scanner;

public class BT11DemsolanXHtrongChuoi {
    public static void main(String[] args) {
        String chuoi;
        char kiTu;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap vao chuoi bat ky: ");
            chuoi = input.nextLine();
        } while (chuoi.length() > 80);
        System.out.println("Nhap vao ky tu can ktra: ");
        kiTu = input.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kiTu == chuoi.charAt(i))
            count++;
        }
        System.out.println("Ki tu "+ kiTu + " xuat hien " + count +" lan");

    }
}
