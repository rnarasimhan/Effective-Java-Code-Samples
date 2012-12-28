package chapter4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/26/12
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
//WrapperClass uses composition instead of inheritance
public class InstrumentedSet<E> extends ForwardingSet<E> {

    int addCount = 0;

    public InstrumentedSet (Set<E> s)
    {
        super(s);
    }

    @Override
    public boolean add(E e)
    {
        addCount++;
        return super.add(e);
    }


    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        addCount+= c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args)
    {
        InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());
        System.out.println(s);
    }
}

