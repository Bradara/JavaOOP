package Person;

public class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }

        this.age = age;
    }

    protected void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s", this.name, this.age);
    }
}
