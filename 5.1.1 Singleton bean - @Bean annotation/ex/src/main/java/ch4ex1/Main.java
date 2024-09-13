package ch4ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        // creates context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class);
        // get the beans
        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);
        System.out.println(cs1 == cs2); // true because cs1 and cs2 refer to the same bean.
    }
}
