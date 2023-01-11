package slide5;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "a"));
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));
        System.out.println(Pattern.matches("[[a-z&&[^m-p]]]", "a"));
        System.out.println(Pattern.matches("[abc]", "c"));
        System.out.println(Pattern.matches("[abc]", "abc"));
        System.out.println(Pattern.matches("[0-9]", "8"));
    }
}
