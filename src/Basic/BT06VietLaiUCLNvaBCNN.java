package Basic;

import java.util.Scanner;

public class BT06VietLaiUCLNvaBCNN {
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN (int a, int b){
        return (a * b)/ UCLN(a,b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b ;
        System.out.print("Nhap gia tri cua a = ");
        a = input.nextInt();
        System.out.print("Nhap gia tri cua b = ");
        b= input.nextInt();
        System.out.println("Uoc Chung LN la: " + UCLN(a,b));
        System.out.println("Boi Chung NN la: " + BCNN(a,b));
    }
}
