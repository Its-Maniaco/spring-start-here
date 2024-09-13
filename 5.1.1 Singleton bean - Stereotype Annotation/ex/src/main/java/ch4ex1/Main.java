package ch4ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        // creates context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class);
        // get the beans
        CommentService cs1 = context.getBean(CommentService.class);
        UserService cs2 = context.getBean(UserService.class);
        // Because the dependency is singleton, both services contain the same
        // reference, so “true.”
        System.out.println(cs1.getCommentRepository() == cs2.getCommentRepository());
    }
}
