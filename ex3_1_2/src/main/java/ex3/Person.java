package ex3;

public class Person {
    private String name;
    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return this.name;
    }

    public Parrot getParrot() {
        return this.parrot;
    }
}