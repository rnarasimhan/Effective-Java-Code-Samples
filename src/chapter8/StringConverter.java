package chapter8;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/7/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringConverter {

    /*
    Takes a string and returns a List<String> by splitting the string delimited by comma.
     */

    public static List<String> getListOfItems(String str)
    {
        List<String> list = Arrays.asList(str.split("\\s*,\\s*"));
        return list;
    }

    /* Takes a List<String> and builds a single string with items separated by comma
     */
    public static String getCompositeString(List<String> list)
    {
        StringBuilder sb = new StringBuilder(128);

        for(String s:list)
        {
            if(sb.length() > 0)
                sb.append(",");
               sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String [] args)
    {
        String testStr = "0112120120120, 0121020120102, 01201201020102, 010220";
        List<String> items = getListOfItems(testStr);

        System.out.println(" List = "+items);

        String result = getCompositeString(items);

        System.out.println(" Result = "+result);



    }
}
