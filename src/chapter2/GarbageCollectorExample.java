package chapter2; /**
 *
 */

import java.util.Date;

/**
 * @author raghuveer_n
 *
 */
public class GarbageCollectorExample {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Runtime rt = Runtime.getRuntime();

        System.out.println("Total Memory = "+rt.totalMemory());

        System.out.println("Free Memory = "+rt.freeMemory());

        Date d = null;
        for(int i =0;i<10000;i++)
        {
            d = new Date();
        }

        System.out.println("After Memory  = "+rt.freeMemory());

        System.gc();

        System.out.println("After GC Memory  = "+rt.freeMemory());

    }
}
