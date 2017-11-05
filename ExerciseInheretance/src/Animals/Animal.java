package Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;
    private String sound;

    Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setSound("Not implemented!");
    }

    void setSound(String sound) {
        this.sound = sound;
    }

    void setName(String name) {
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    void setGender(String gender) {
        if (!("female".equalsIgnoreCase(gender)||"male".equalsIgnoreCase(gender))) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %s %s%n%s", this.getClass().getSimpleName(), this.name, this.age, this.gender, this.sound);
    }
}
