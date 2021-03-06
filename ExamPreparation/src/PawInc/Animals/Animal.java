package PawInc.Animals;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansed;
    private String adoptionCenterName;

    Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setUncleaned();
    }

    Animal(String name, int age, String adoptionCenterName) {
        this(name, age);
        this.adoptionCenterName = adoptionCenterName;
    }

    public String getAdoptionCenterName() {
        return this.adoptionCenterName;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isCleansed() {
        return this.cleansed;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    private void setUncleaned() {
        this.cleansed = false;
    }

    public void setCleaned() {
        this.cleansed = true;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
