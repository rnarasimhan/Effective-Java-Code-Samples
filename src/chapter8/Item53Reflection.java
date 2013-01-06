package chapter8;

import java.util.Arrays;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 1/6/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item53Reflection {

    public static void main (String[] args)
    {
        //Translate the class name into a class object
        Class<?> cl = null;
        try{
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //Instantiate a class
        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //Exercise the Set
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
