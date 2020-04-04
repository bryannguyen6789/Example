package Basic;

import java.util.ArrayList;

public class BT03LietKeSNT {
        public static void main(String[] args) {
            System.out.println("List cac so chia het cho 7 va la boi cua 5 la : ");
            for (int i = 10 ; i < 201 ; i++){
                if ((i % 7 == 0)&& (i % 5 == 0))
                    System.out.println(i);
            }
        }
    }
