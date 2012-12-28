package chapter4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/26/12
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */

public class ForwardingSet<E> implements Set<E> {

    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public int size() {
        return s.size();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator<E> iterator() {
        return s.iterator();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object[] toArray() {
        return s.toArray();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return s.toArray(a);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean add(E e) {
        return s.add(e);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return s.retainAll(c);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return s.removeAll(c);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        s.clear();
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
