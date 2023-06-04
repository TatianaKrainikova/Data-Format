package pract.date;

import java.util.Date;

public class Ex3 {

    public static void main(String[] args) throws InterruptedException {

        Date date1 = new Date();

        Thread.sleep(2000);
        Date date2 = new Date();

        System.out.println(date1.before(date2));

        System.out.println(date1.after(date2));
    }
}
