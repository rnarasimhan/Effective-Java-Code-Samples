package chapter7;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/5/13
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */


//Broken "immutable" time period class
public final class Period {


      private final Date start;
      private final Date end;

        public Period (Date start, Date end)    {
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());

            if (start.compareTo(end) > 0)
                throw new IllegalArgumentException(start+" after "+end);
        }


    //Make defensive copies of internal fields
    public Date start() {
        return new Date(start.getTime());
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Date end() {
        return new Date(end.getTime());
    }

    public static void main(String[] args)
    {
       Date start = new Date();
       Date end = new Date();
       Period p = new Period(start, end);
       end.setYear(78);

      System.out.println("Period = "+p.toString());

      p.end().setYear(88);       //Modifies internals of p!

      System.out.println("Period = "+p.toString());
    }

}
