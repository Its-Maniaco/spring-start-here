package ch2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        return new Parrot("parrot1");
    }

    @Bean
    Parrot parrot2() {
        return new Parrot("parrot2");
    }

    @Bean
    Parrot parrot3() {
        return new Parrot("parrot3");
    }

}