package Basic;

import java.util.Scanner;

public class BT05DaySoFibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri n: ");
        n = input.nextInt();
        System.out.println("Day so fibonacci la: ");
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(fibonacci(i)+ " ");
        }

    }
}
