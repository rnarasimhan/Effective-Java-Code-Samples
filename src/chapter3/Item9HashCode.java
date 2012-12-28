package chapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/23/12
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 */
public final class Item9HashCode  implements  Cloneable, Comparable<Item9HashCode>
{

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public Item9HashCode (int areaCode, int prefix, int lineNumber)
    {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg <0 || arg> max)
        {
            throw new IllegalArgumentException(name+": "+arg);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item9HashCode)) return false;

        Item9HashCode that = (Item9HashCode) o;

        if (areaCode != that.areaCode) return false;
        if (lineNumber != that.lineNumber) return false;
        if (prefix != that.prefix) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;
        return result;
    }

    @Override
    public String toString() {
            return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber) ;
    }

    @Override
    public Item9HashCode clone()
    {
        try{
            return (Item9HashCode) super.clone();
        }
        catch(CloneNotSupportedException e) {
            throw new AssertionError(); //Can't happen
        }
    }

    public int compareTo(Item9HashCode pn)
    {
        if(areaCode < pn.areaCode)
            return -1;
        if(areaCode > pn.areaCode)
            return 1;

        if(prefix < pn.prefix)
            return -1;
        if(prefix > pn.prefix)
            return 1;

        if(lineNumber < pn.lineNumber)
            return -1;
        if(lineNumber > pn.lineNumber)
            return 1;

        return 0; //All equal
    }

    public static void main (String [] args)
   {
       Item9HashCode phoneRecord1 = new Item9HashCode(312, 714,3622);
       Map<Item9HashCode, String> m = new HashMap<Item9HashCode, String>();
       m.put(phoneRecord1, "Raghuveer");

       Item9HashCode phoneRecord2 = new Item9HashCode(312, 714,3622);
       System.out.println(" Who's phone number is it? "+m.get(phoneRecord2));

       System.out.println(" Phone Number = "+phoneRecord2);

       Item9HashCode pR3 = phoneRecord1.clone();

       System.out.println(" equals() ? = "+(pR3.hashCode() == phoneRecord1.hashCode()));

       Item9HashCode pr4 = new Item9HashCode(312,714,3621);
       System.out.println(" CompareTo = "+(pr4.compareTo(phoneRecord1)));



   }

}
