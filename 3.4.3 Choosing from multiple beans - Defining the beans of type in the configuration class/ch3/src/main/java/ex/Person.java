package ex;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private final Parrot parrot;

    // here the name is same as that of bean in projectconfig
    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Parrot getParrot() {
        return this.parrot;
    }
}
