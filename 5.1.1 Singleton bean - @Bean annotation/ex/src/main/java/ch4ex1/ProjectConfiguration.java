package ch4ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import services.CommentService;

@Configuration
public class ProjectConfiguration {
    // adds bean to context. 
    // when using this to add bean, name of method becomes bean's name
    @Bean
    public CommentService commentService() {
        return new CommentService(null, null);
    }
}
