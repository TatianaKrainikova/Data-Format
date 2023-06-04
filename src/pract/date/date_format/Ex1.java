package pract.date.date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1 {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(12124442121212L);

        System.out.println(formatter.format(date));

        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date(1912828828L);
        System.out.println(formatter1.format(date1));
    }
}
