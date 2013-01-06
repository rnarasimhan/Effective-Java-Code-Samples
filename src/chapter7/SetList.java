package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/5/13
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class SetList {

    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = -3;i<3;i++) {
            set.add(i);
            list.add(i);
        }

        for (int i =0;i<3; i++){
            set.remove(i);             //remove(E)
            list.remove(i);            //remove (index)
        }

        System.out.println(set+" "+list);
    }
}
