package pract.date;

import java.util.Date;

public class Ex4 {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        System.out.println(date1.equals(date2));
    }
}
