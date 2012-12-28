package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/22/12
 * Time: 7:14 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Item3EnumSingleton {

        INSTANCE;

    public int getElvisAge() {
        return elvisAge;
    }

    public void setElvisAge(int elvisAge) {
        this.elvisAge = elvisAge;
    }

    private int elvisAge;

        public void leaveTheBuilding(){
            System.out.println("Elvis is "+elvisAge+" years old.");
        }


    public static void main(String [] args)
    {
        Item3EnumSingleton.INSTANCE.setElvisAge(40);
        Item3EnumSingleton.INSTANCE.setElvisAge(41);

        System.out.println("Elvis is "+Item3EnumSingleton.INSTANCE.getElvisAge()+" years old.");

    }
}
