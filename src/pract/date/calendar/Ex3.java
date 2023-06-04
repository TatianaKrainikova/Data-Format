package pract.date.calendar;

import java.util.Calendar;
;import java.util.GregorianCalendar;

public class Ex3 {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);

        calendar.set(Calendar.HOUR, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        System.out.println(calendar.getTime());

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());


    }
}
