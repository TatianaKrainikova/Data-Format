package pract.date.date_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex2 {

    public static void main(String[] args) {

        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat formatter = new SimpleDateFormat(
                "EEE, MMMM d, yyyy", Locale.ENGLISH);

        try {
            Date date = formatter.parse(strDate);
            System.out.println(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }


        String strDate1 = "Mon, August 10, 2000, 22:10:10";
        SimpleDateFormat formatter1 = new SimpleDateFormat(
                "EEE, MMMM d, yyyy, HH:mm:ss", Locale.ENGLISH);

        try {
            Date date1 = formatter1.parse(strDate1);
            System.out.println(date1);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
