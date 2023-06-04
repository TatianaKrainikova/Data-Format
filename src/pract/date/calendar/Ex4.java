package pract.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex4 {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day of week in month: " + calendar.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Number: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Hours: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
        System.out.println("MilliSecond: " + calendar.get(Calendar.MILLISECOND));
    }
}
