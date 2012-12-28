package chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/23/12
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item13LimitedAccess
{

    //Potential security hole!   - Any non-zero length array is always mutable
    public static final int[] PRIVATE_VALUES
            = {2,3,4};


     public static  void main(String[] args)
     {
         PRIVATE_VALUES[0] = 5;

        System.out.println(PRIVATE_VALUES[0]);

     }
}
