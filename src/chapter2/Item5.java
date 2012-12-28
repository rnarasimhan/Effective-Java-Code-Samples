package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/22/12
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Item5 {

    private final Date birthDate = Calendar.getInstance().getTime();

    //Start and end date  of baby boom
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) <0;

    }



    public static void  main(String [] args)
    {
        Item5 i5 = new Item5();
        System.out.println(" Is baby boomer ? "+i5.isBabyBoomer()) ;
    }

}
