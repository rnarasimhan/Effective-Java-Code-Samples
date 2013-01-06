package chapter8;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/6/13
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item49 {

    static Comparator<Integer> naturalOrder = new Comparator<Integer>() {
        public int compare(Integer first, Integer second) {
            int f = first;
            int s = second;

            return f < s? -1: (f == s)?0:1;
        }
    };

    static int i;

    public static void main (String[] args)
    {
       System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));

        if(i==42){
            System.out.println("Un-believable");
        }


        long startTime =  System.currentTimeMillis();

        Long sum = 0L;
        for(long i =0; i<Integer.MAX_VALUE;i++)
        {
            sum+=i;
        }
        long endTime =  System.currentTimeMillis();

        System.out.println("Sum = "+sum);

        System.out.println("Time to Run (in seconds) = "+(endTime-startTime)/1000);
    }

}
