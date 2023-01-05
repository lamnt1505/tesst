package slide5;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String []args){
        double us = 12324.134f;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String s = currencyFormat.format(us);
        System.out.println("Us"+ s);

        double IN = 12324.134;
        Locale localeIN = new Locale("en","in");
        NumberFormat currencyIN = NumberFormat.getCurrencyInstance(localeIN);
        String s1 = currencyIN.format(IN);
        System.out.println("India: " + s1);

        double CN = 12324.134;
        Locale localeCN = new Locale("zh", "china");
        NumberFormat currencyCN = NumberFormat.getCurrencyInstance(localeCN);
        String s2 = currencyCN.format(CN);
        System.out.println("China:"  + s2);

        double Fc = 12324.134;
        Locale localeFC = new Locale("en", "France");
        NumberFormat currencyFC = NumberFormat.getCurrencyInstance(localeFC);
        String s3 = currencyFC.format(Fc);
        System.out.println("France:" + s3);
    }
}
