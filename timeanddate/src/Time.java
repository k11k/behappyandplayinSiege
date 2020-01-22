import sun.util.calendar.LocalGregorianCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    public static void main(String args[]) {

        Date date = new Date();
        SimpleDateFormat formatfordate = new SimpleDateFormat("kk:mm:ss");

        System.out.println("Текущее время " +formatfordate.format(date));


    }

}
