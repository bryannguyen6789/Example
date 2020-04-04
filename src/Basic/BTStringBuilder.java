package Basic;

public class BTStringBuilder {
    public static void main(String[] args) {
        StringBuilder StrBuilder = new StringBuilder();
        StrBuilder.append("Dai");
        StrBuilder.append("An");
        StrBuilder.insert(0,"Nguyen");
        String reverseName = StrBuilder.reverse().toString();
        System.out.println(reverseName);

    }
}
