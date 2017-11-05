package Animals;

class Cat extends Animal {
    Cat(String name, int age, String gender) {
        super(name, age, gender);
        super.setSound("MiauMiau");
    }
}
