package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/24/12
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
public final class Item15Immutability {

    public static final Item15Immutability ZERO = new Item15Immutability(0,0);
    public static final Item15Immutability ONE = new Item15Immutability(1,0);
    public static final Item15Immutability I = new Item15Immutability(0,1);

    private final double re;
    private final double im;

    public Item15Immutability(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    //Accessors with no corresponding mutators
    public double realPart() { return re; }
    public double imaginaryPart() { return im; }


    public Item15Immutability add(Item15Immutability c){
        return new Item15Immutability(re + c.re, im + c.im);     //Create a new instance rather than modifying an existing one.
    }

    public Item15Immutability subtract(Item15Immutability c){
        return new Item15Immutability(re - c.re, im - c.im);
    }

    public Item15Immutability multiply(Item15Immutability c){
        return new Item15Immutability(re*c.re - im*c.im,
                                            re*c.im+im*c.re);
    }

    public Item15Immutability divide(Item15Immutability c){

        double tmp = c.re*c.re+c.im*c.im;
        return new Item15Immutability((re*c.re +  im*c.im)/tmp,
                (im*c.re - re*c.im)/tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item15Immutability that = (Item15Immutability) o;

        if (Double.compare(that.im, im) != 0) return false;
        if (Double.compare(that.re, re) != 0) return false;

        return true;
    }



    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = re != +0.0d ? Double.doubleToLongBits(re) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        temp = im != +0.0d ? Double.doubleToLongBits(im) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Item15Immutability{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }


}
