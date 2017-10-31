package FragileBaseClass;

import java.util.List;

public class Animal {
    protected List<Food> foodEaten;

    public void eat(Food food) {
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        for (Food food : foods) {
            this.foodEaten.add(food);
        }
    }
}
