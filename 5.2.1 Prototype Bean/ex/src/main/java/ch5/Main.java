package ch5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);
        System.out.println(cs1 == cs2);
    }
}
