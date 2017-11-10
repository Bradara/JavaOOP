package PawInc.Animals;

public class Dog extends Animal{
    private int command;

    Dog(String name, int age, int command) {
        super(name, age);
        this.command = command;
    }

    public Dog(String name, int age, int command, String adoptionCenter){
        super(name, age, adoptionCenter);
        this.command = command;
    }

    public int getCommand() {
        return this.command;
    }
}
