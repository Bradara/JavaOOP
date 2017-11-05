package Person;

class Child extends Person {
    Child(String name, int age) {
        super(name, age);
        this.checkAge(age);
    }

    void checkAge(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
    }
}
