package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/28/12
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item23RawType
{
    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }

    public static void main(String[] args) {
      List<String> strings = new ArrayList<String>();
      unsafeAdd(strings, new Integer(42));
      String s = strings.get(0); //Compiler-generated case
    }

    //Unbounded wildcard type - typsafe and flexible
    static int numElementsInCommon(Set<?> s1, Set<?> s2)
    {
        int result = 0;
        for(Object o1:s1)
        {
            if(s2.contains(o1))
                result++;
        }
        return result;
    }
}
