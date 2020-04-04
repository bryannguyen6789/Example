package Basic;

public class BTveString {
    public static void main(String[] args) {
        String myName ="Dai AN";
        String firstName = myName.substring(0,3);
        String lastName = myName.substring(4);
        int len = myName.length();
        System.out.println("Length of my Name is: " + len);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name :" + lastName);

        String firstString = "Nguyen ";
        String secondString = "Hello";
        String result = firstString + secondString;
        System.out.println(result);
    }
}
