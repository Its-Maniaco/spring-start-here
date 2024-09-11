package ex;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Cucooo";

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