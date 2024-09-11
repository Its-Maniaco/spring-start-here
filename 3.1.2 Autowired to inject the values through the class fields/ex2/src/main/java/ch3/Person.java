package ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Bella";

    /*
     * instruct Spring to provide a bean from its context and set it directly as
     * the value of the field, annotated with @Autowired.
     * This way we establish a relationship between the two beans.
     */
    @Autowired
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