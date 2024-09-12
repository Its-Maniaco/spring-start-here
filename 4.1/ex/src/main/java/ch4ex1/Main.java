package ch4ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class);
        Comment comment = new Comment("Laurentiu", "Demo comment");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
