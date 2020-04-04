package Basic;

public class BTveifelse {
    public static void main(String[] args) {
        int a = 5;
//        if (a % 2 == 0) {
//            System.out.println("a la so chan");
//        } else {
//            System.out.println("a la so le");
//        }
        float mark = 6.5f;
        if (mark >= 9.0) {
            System.out.println("SX");
        } else if (mark >= 8.0 && mark <= 8.9) {
            System.out.println("Gioi");
        } else if (mark >= 6.5 && mark <= 7.5) {
            System.out.println("Kha");
        } else {
            System.out.println("TB");
        }
    }
}
