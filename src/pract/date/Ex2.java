package pract.date;

import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {

        Date date1 = new Date();

        Date date2 = new Date();

        System.out.println(date1 + "\n" + date2);
        System.out.println((date1.getTime() > date2.getTime()) ?
                "date1 after date2" : "date1 before data2");
    }
}
