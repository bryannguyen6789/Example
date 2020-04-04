package Basic;

import java.util.Scanner;

public class BT12PhuongThucTrongLT {
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int[] nhapMang(int n, Scanner input) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1, arr2, arr3;
        int n1 = 5, n2 = 7, n3 = 9;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu mang 1 la: ");
        arr1 = nhapMang(n1, input);
        System.out.println("nhap so phan tu mang 2 la: ");
        arr2 = nhapMang(n2, input);
        System.out.println("nhap so phan tu mang 3 la: ");
        arr3 = nhapMang(n3, input);
        int max = Max(arr1);
        System.out.println("So lon nhat trong mang la: " + max);
    }
}
