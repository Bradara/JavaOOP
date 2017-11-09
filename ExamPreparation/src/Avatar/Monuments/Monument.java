package Avatar.Monuments;

public abstract class Monument {
    private String name;

    public Monument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getAffinity();
}
