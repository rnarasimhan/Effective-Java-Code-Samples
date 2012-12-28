package chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: raghuveer_n
 * Date: 12/22/12
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item2BuilderPattern {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbs;

    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories =  0;
        private int fat =  0;
        private int sodium =  0;
        private int carbs =  0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val) {
            calories = val; return this;
        }

        public Builder fat(int val) {
            fat = val; return this;
        }

        public Builder sodium(int val) {
            sodium = val; return this;
        }
        public Builder carbs(int val) {
            carbs = val; return this;
        }

        public Item2BuilderPattern build() {
            return new Item2BuilderPattern(this);
        }
    }

    private Item2BuilderPattern(Builder builder)
    {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbs = builder.carbs;
    }

    public static void main(String [] args)
    {
        Item2BuilderPattern cocaCola = new Builder(240, 8).calories(100).sodium(35).carbs(27).build();

        System.out.println("Coca Cola Nutrition Label : "+cocaCola);
    }

}
