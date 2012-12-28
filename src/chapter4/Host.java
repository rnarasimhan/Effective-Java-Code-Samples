package chapter4;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/27/12
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Host
{
    private static class StrLenCmp implements Comparator<String>, Serializable
    {
        public int compare(String s1, String s2)
        {
          return s1.length() - s2.length();
        }

        //Returned comparator is serializable
        public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
    }
}

//For Anonymous class

