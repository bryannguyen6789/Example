package Basic;

public class BTStringAPI {
    public static void main(String[] args) {
        String myName = "Dai An";
        String Name = "Bryan Nguyen stay in Hanoi";
        System.out.println(Name.toUpperCase());
//        for( int i = 0 ; i <= myName.length(); i++)
//        {
//            System.out.println(myName.charAt(i));
//        }
        String res[]= Name.split(" ");
        for (String s: res)
            System.out.println(s);
        System.out.println(Name.startsWith("Bryan"));
        System.out.println(Name.startsWith("bryan"));
        System.out.println(Name.endsWith("i"));
        System.out.println(Name.endsWith("I"));
    }
}
