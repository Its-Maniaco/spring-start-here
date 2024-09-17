package ch6;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Comment;
import services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Lauren Ipsum Text");
        comment.setAuthor("John Doe");

        service.delete(comment);
    }
}
