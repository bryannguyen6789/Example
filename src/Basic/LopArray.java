package Basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LopArray {
    public static void main(String[] args) {
        int[] arr =  new int[]{23,5,6,12,65,789,32,12,45,89,6};
        String[] names = {"Viet","Nam","Dan" ,"Chu","Cong","Hoa"};
        String res = Arrays.toString (names);
        System.out.println(res);
        Arrays.sort(names, Collections.reverseOrder());
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(arr));
    }
}
