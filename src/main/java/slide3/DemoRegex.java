package slide3;

import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z&&[^bc]]","a"));//a->z(b,c)
        System.out.println(Pattern.matches("[a-z&&[^bc]]","b"));//sai pt
        System.out.println(Pattern.matches("[[a-z&&[^m-p]]]","a"));//đúng pt
        System.out.println(Pattern.matches("[abc]","c"));
        System.out.println(Pattern.matches("[abc]","abc"));
        System.out.println(Pattern.matches("[0-9]","1"));
    }
}
