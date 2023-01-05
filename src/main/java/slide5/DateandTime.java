package slide5;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class DateandTime {
    int month = 8;
    int day = 14;
    int year = 2017;

    public static void main(String []args){
        LocalDate localDate = LocalDate.of(2017,8,14);
        int dayOfWeek = localDate.get(WeekFields.of(Locale.getDefault()).dayOfWeek());
        System.out.println(dayOfWeek);
    }
}
