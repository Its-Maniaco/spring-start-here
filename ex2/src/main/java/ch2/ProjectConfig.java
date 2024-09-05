package ch2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

// to define this class as Spring configuration
@Configuration
public class ProjectConfig {
    // instruct Spring to call this method when at context initialization and add
    // the returned value to the context.
    @Bean
    Parrot parrot() {
        Parrot p = new Parrot(null);
        p.setNamme("Koko");
        return p;
    }

    @Bean
    String helloWorld() {
        return "Hello World!";
    }

    // looks lie cannot have 2 beans of same type
    // Spring looks for a bean of the type you requested in its context. See ch2 ex3
    /*
     * @Bean
     * String helloWorldAgain() {
     * return "Hello World! AGAIN!";
     * }
     */ 
}
