package chapter4;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/26/12
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sub extends Super {
    private final Date date; //Blank final, set by constructor

    Sub () {
        date = new Date();
    }

    //Overriding method invoked by superclass constructor
    @Override public void overrideMe(){
        System.out.println(date);
    }

    public static void main(String [] args){
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
