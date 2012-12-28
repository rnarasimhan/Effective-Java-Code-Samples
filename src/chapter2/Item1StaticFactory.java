package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/22/12
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item1StaticFactory
{
    public static Boolean valueOf(boolean b)
    {
        return b? Boolean.TRUE: Boolean.FALSE;
    }

    public static void main (String[] args)
    {
        boolean primitiveVar = false;

        System.out.print("Object Boolean = "+(valueOf(primitiveVar) instanceof Boolean));
    }
}
