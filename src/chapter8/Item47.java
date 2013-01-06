package chapter8;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/6/13
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item47 {

   private static final Random rnd = new Random();

   //Common but deeply flawed!
    static int random (int n){
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args)
    {
        int n = 2*(Integer.MAX_VALUE/3);
        int low = 0;

        for(int i =0; i<100000; i++)
            if(random(n) < n/2)
                low++;

        System.out.println(low);
    }
}
