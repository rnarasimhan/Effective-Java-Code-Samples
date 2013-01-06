package chapter5;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/30/12
 * Time: 8:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericStack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public GenericStack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if(size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; //Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

    //Wildcard type for parameter that serves as an E producer
    public void pushAll(Iterable<? extends E> src)
    {
        for(E e:src)
            push(e);
    }

    //Wildcard type for parameter that serves as an E consumer
    public void popAll(Collection<? super E> dst)
    {

    }
    public static void main(String [] args)
    {
        GenericStack<String> stack = new GenericStack<String>();
        for(String arg:args)
            stack.push(arg);
        while(!stack.isEmpty())
            System.out.println(stack.pop().toString());

        GenericStack<Number>  numberGenericStack = new GenericStack<Number>();


    }

}
