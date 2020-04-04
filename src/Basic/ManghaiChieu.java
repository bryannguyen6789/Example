package Basic;

public class ManghaiChieu {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        boolean[][] kTra = new boolean[9][9];
        String[][] strings = new String[2][3];
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {6, 4, 3, 8}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr + " ");
            }
        }
    }
}
