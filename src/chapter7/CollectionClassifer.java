package chapter7;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/5/13
 * Time: 8:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionClassifer {

    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst){
        return "List";
    }

    public static String classify (Collection<?> c){
        return "Unknown Collection";
    }

    public static String reclassify (Collection<?> c){
        return c instanceof Set? "Set": c instanceof List? "List": "Unknown Collection";
    }

    public static void main(String[] args){
        Collection<?>[] collections = {
                new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()
        };

        for(Collection<?> c: collections)
        {
            System.out.println(classify(c));
            System.out.println("Actual = "+reclassify(c));

        }

    }
}
