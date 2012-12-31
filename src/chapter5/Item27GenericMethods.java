package chapter5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/30/12
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item27GenericMethods {

    public static Set union(Set s1, Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    //Generic Method
    public static <E> Set<E> genericUnion(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args){
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom","Dick","Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Curly","Larry","Moe"));
        Set<String> aflCio = genericUnion(guys, stooges) ;
        System.out.println(aflCio);
    }
}
