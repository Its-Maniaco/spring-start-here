package ex3;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot created.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}