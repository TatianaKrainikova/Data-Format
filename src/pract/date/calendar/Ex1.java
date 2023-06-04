package pract.date.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex1 {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2017, 0, 25);
        Date date = calendar.getTime();
        System.out.println(date);

        Calendar calendar1 = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        System.out.println(calendar1.getTime());
    }
}
