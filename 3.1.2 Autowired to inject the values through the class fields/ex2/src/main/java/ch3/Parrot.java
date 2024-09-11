package ch3;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    // manhaging value during initializtion is difficult
    // this is what we are doing currently in autowired
    private String name = "Kokokokoko";

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