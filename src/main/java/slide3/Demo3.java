package slide3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
    public static void main(String[] args) {
        String text1 = "Hello java regex 28-12-2022, hello world 30/12/2022";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
        while (matcher.find()){
            System.out.println(text1.substring(matcher.start(),matcher.end()));
        }

        String text2 = "28/12/2022";
        String text3 = "30/12/aaaa";
        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        System.out.println("\nChuỗi" + text2 + "có định dạng ngày tháng:" + pattern.matcher(text2).matches());
        //kt biểu thức chính quy có khớp với mẫu

        System.out.println("Chuỗi" + text3 + " có định dạng ngày tháng: " + pattern.matcher(text3).matches());
    }
}
