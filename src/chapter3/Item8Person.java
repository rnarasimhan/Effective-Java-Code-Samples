package chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/23/12
 * Time: 8:50 AM
 * To change this template use File | Settings | File Templates.
 */

public class Item8Person  implements Cloneable
{
    private int id;
    private String firstName;
    private String lastName;

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item8Person)) return false;

        Item8Person that = (Item8Person) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public static void main(String [] args)
{
    Item8Person p1 = new Item8Person();
    p1.setFirstName("Raghuveer"); p1.setLastName("Narasimhan"); p1.setId(2070);

    Item8Person p2 = new Item8Person();
    p2.setFirstName("Raghuveer"); p2.setLastName("Narasimhan"); p2.setId(2070);

    System.out.println("Does Person1 equals Person 2 ? "+p1.equals(p2));


}
}