package Basic;

import java.util.Scanner;

public class BT07LietKeSNTNhoHonn {
    public static boolean kTraSNT(int n)
    {
        for( int i = 2 ; i <= n/2 ; i ++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        int n ;
////        Scanner input = new Scanner(System.in);
////        System.out.println("Nhap gia tri n = ");
////        n = input.nextInt();
////        System.out.println("Cac so nguyen to la: ");
////        for ( int i = 3; i < n ; i ++ )
////        {
////            if (kTraSNT(i)){
////                System.out.println(" " + i);
////            }
////
////        }
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri n = ");
        n = input.nextInt();
        int i = 2;
        for ( int dem = 0 ; dem < n; i++ )
        {
            if (kTraSNT(i))
            {
                System.out.print(" " + i);
                dem++;
            }
        }

    }
}

