package MordorsCrueltyPlan;

import java.util.List;

public class Gandalf extends  Food{
    private String mood;
    private List<String> foods;
    private int happiness;

    Gandalf(List<String> foods) {
        super();
        this.setFoods(foods);
        this.setMood();
    }

    void setFoods(List<String> foods) {
        this.foods = foods;
    }

    void setMood() {
        this.happiness = 0;

        for (String food : foods) {
            this.happiness += super.foodsIndex.getOrDefault(food.toLowerCase(), -1);
        }

        int cases = this.happiness<0?(this.happiness<-5?0:1):(happiness<16?2:3);

        switch (cases){
            case 0: this.mood = "Angry";break;
            case 1: this.mood = "Sad"; break;
            case 2: this.mood = "Happy"; break;
            case 3: this.mood = "JavaScript";break;
        }
    }


    @Override
    public String toString() {
        return String.format("%d%n%s%n", this.happiness, this.mood);
    }
}
