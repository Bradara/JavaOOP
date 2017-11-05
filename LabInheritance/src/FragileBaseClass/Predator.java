package FragileBaseClass;

import java.util.ArrayList;

class Predator extends Animal {
    private int health;

    Predator() {
        super.foodEaten = new ArrayList<>();
        this.setHealth();
    }

    void feed(Food food){
        this.eat(food);
    }

    int getHealth() {
        this.health=this.foodEaten.size();
        return this.health;
    }

    void setHealth() {
        this.health = this.foodEaten.size();
    }
}
