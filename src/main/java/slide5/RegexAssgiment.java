package slide5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssgiment {
    public static void main(String[] args) {
        String input = "000.12.12.034" +
                "121.234.12." +
                "1223.45.12.56";

        String regex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            System.out.println("OK");
        }else{
            System.out.println("Not OK");
        }
    }
}
