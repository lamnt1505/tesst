package slide3;

import java.util.regex.Pattern;

public class Demo4 {
    public static void main(String[] args) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        String email1 = "test1@gmail.com.vn";
        String email2 = "123test@gmail.com.vn";//sai(bắt đầu bằng chữ cái)
        String email3 = "test2@gmail.com";//đúng bắt đầu chữ cái, chữ số
        String email4 = "test3-1@gmail.com";//đúng bắt đầu chữ cái, chữ số,có dấu ngạch ngang
        String email5 = "test4@@gmail.com";//sai vì 2 @@
        String email6 = "test5@domain.com";//đúng sau @ là tên miền
        String email7 = "test6@gmail";//thiếu tên miền

        System.out.println(email1 + ": " + Pattern.matches(EMAIL_PATTERN, email1));
        System.out.println(email2 + ": " + Pattern.matches(EMAIL_PATTERN, email2));
        System.out.println(email3 + ": " + Pattern.matches(EMAIL_PATTERN, email3));
        System.out.println(email4 + ": " + Pattern.matches(EMAIL_PATTERN, email4));
        System.out.println(email5 + ": " + Pattern.matches(EMAIL_PATTERN, email5));
        System.out.println(email6 + ": " + Pattern.matches(EMAIL_PATTERN, email6));
        System.out.println(email7 + ": " + Pattern.matches(EMAIL_PATTERN, email7));
    }
}
