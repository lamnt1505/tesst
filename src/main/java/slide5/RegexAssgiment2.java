package slide5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssgiment2 {
    public static void main(String[] args) {
        String phoneNumber = "(043)     2626    5555";
        String input = "0916808376";

        String regex = "(^\\((\\d{3}\\))\\s+(\\d{4})]]\\s+(\\d{4})$)";//^09\d{8}$

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.find()){
            System.out.println("OK");
        }else{
            System.out.println("Not ok");
        }
    }
}
