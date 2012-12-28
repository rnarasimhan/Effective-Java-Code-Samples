package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/22/12
 * Time: 7:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item4PrivateConstructor
{
    private Item4PrivateConstructor(){
        throw new AssertionError();
    }

    public void printStatement(){
        System.out.println("This constructor cannot be instantiated !");
    }



    public class Impostor
    {
        public void main(String[] args)
        {
             Item4PrivateConstructor i4 = new Item4PrivateConstructor();
             i4.printStatement();
        }

    }
}

