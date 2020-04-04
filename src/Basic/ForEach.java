package Basic;

public class ForEach {
    public static void main(String[] args) {
        String name = "Viet Nam Dan Chu Cong Hoa De Quoc Myu";
        String[] names = name.split(" ");
        for (String splname : names)
        {
            System.out.println("name: " + splname);
        }
        for (String s: names) {
            System.out.println(s);
        }
        int[] giaTri = {6,3,5,8,6,4,6,4,63,2,1};
        for (int x: giaTri)
        {
            System.out.println("X = " + x);
        }
    }
}
