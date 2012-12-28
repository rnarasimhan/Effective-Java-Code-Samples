package chapter4;

import javax.swing.*;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/27/12
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractMapEntry implements Map.Entry<K,V>
{
  //Primitive Operations
  public abstract K getKey();
  public abstract V getValue();

  //Entries in modifiable maps must override this method
    public V setValue(V value)
    {
        throw new UnsupportedOperationException();
    }

    //Implements the general contract of Map.Entry.equals
    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Map.Entry))
            return false;

        Map.Entry<?,?> arg = (Map.Entry) obj;

        return equals(getKey(), arg.getKey()) && equals(getValue(), arg.getValue());    //To change body of overridden methods use File | Settings | File Templates.
    }

    private static boolean equals(Object o1, Object o2)
    {
        return o1==null?o1==null:o1.equals(o2);
    }

    @Override
    public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }

    private static int hashCode(Object obj)
    {
        return obj == null?0:obj.hashCode();
    }

}
