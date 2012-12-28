package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/26/12
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Super
{
    //Broken - constructor invokes an overrideable method.
    public Super()
    {
        overrideMe();
    }
    public void overrideMe()
    {
    }
}
