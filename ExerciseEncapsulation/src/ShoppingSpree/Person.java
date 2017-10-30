package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> purchase;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.purchase = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    void buyProduct(Product product){
        if (product.getPrice() > this.money) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }

        this.purchase.add(product);
        this.money -= product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.name, this.purchase.size() > 0 ? this.purchase.stream().map(Product::getName).collect(Collectors.joining(", ")): "Nothing bought");
    }
}
