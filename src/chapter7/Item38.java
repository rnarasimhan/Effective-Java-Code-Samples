package chapter7;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/5/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item38 {

   /* Returns a BigInteger whose value is (this mod m). This method differs from the remainder
     method in that it always returns a non-negative Big Integer
      */
   public static BigInteger mod(BigInteger m) {
        if(m.signum() <=0)
            throw new ArithmeticException("Modulus <= 0:"+m);

       //Do the computation.
       return BigInteger.ONE;
   }

    //Non-public methods should generally check their parameters using assertions, as show below:
    private static void sort(long[] a, int offset, int length) {
        assert a!= null;
        assert offset >=0 && offset <= a.length;
        assert length>=0 && length <= a.length - offset;
    }

    public static void main (String[] args)
    {
        sort(null, 1, 1);
    }
}
