package Basic;

public class ViduChuoi {
    public static void main(String[] args) {
        String name="Dai An";
        for (int i = 0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
        String firstName = "Bryan";
        String lastName = "Nguyen";
        firstName = firstName + lastName;
        System.out.println(firstName);
        System.out.println(lastName);

        String firstString = "Jame";
        String secondString = "Jame";
        String thirdString = "JAME";
        String fourString = "jame";
        System.out.println(firstString ==  secondString);
        System.out.println(firstString.equals(secondString));
        System.out.println(thirdString.equals(fourString));
        System.out.println(secondString.equalsIgnoreCase(fourString));
        String emptyString = "";
        String nullString = null;
        System.out.println(emptyString.length());
        
    }

}
