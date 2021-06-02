package calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_Calendar {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month " + month);

        Date x1 = new Date();
        cal.setTime(x1);
        minutes = cal.get(Calendar.HOUR);
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH");// HH imprime em 24h e hh imprime em 12h
        System.out.println(sdf1.format(x1));
        
    }
}
