package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class BT09Mang2chieu {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu mang: ");
            n = input.nextInt();
        } while (n < 0);

        int A[] = new int[n];

        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = input.nextInt();
        }

        System.out.println("Mang ban dau la : ");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + " ");
        }
        int max = A[0];
        int min = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Gia tri lon nhat trong phan tu la: " + min);
        System.out.println("Gia tri nho nhat trong phan tu la: " + max);

        int soChan = 0;
        for (int i = 0; i < n ; i++) {
            if (A[i] % 2 == 0)
                soChan ++;
        }
        System.out.println("So phan tu chan trong mang la: " + soChan);
        Arrays.sort(A);
        System.out.println("Mang sau khi sap xep");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
    }
}
