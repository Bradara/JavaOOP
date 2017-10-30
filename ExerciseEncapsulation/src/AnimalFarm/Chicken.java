package AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private double eggsPerDay;

    Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setEggsPerDay();
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name should be at least 1 symbol long.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void setEggsPerDay() {
        if (this.age < 6) {
            this.eggsPerDay = 2.0;
        } else if (age < 12) {
            this.eggsPerDay = 1.0;
        } else{
            this.eggsPerDay = 0.75;
        }
    }

    @Override
    public String toString() {
        if (this.age < 12) {
            return String.format("Chicken %s (age %d) can produce %.0f eggs per day.", this.name, this.age, this.eggsPerDay);
        }

        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.eggsPerDay);
    }
}
