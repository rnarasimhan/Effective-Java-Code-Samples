package chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/30/12
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item25ListVsArrays {

    public static void main (String [] args)
    {
        //Fails at runtime
        Object[] objectArray = new Long[1];
        objectArray[0] = "This won't work";      //Array Store Exception

//        //Won't Compile
//        List<Object> ol = new ArrayList<Long>();
//        ol.add("This wont work");

    }
}
