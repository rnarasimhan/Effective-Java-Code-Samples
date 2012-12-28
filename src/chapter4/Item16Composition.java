package chapter4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/26/12
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item16Composition<E> extends HashSet<E> {

    //#Attempted element insertions
    private int addCount=0;

    public Item16Composition (){

    }

    public Item16Composition (int initCap, float loadFactor){
                                                    super(initCap, loadFactor);
    }

    @Override
    public String toString() {
        return "Item16Composition{" +
                "addCount=" + addCount +
                '}';
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        addCount+= c.size();
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args)
    {
        Item16Composition<String> s = new Item16Composition<String>();
        s.addAll(Arrays.asList("Snap","Crackle","Pop"));
        System.out.println(s);
    }

}
