package ch5;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import services.CommentService;

@Configuration
public class ProjectConfiguration {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE) // create new instance everytime this is requested
    public CommentService commentService() {
        return new CommentService();
    }
}
