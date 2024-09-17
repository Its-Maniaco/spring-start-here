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

    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Lauren Ipsum Text");
        comment.setAuthor("John Doe");

        String val = service.publishComment(comment);
        logger.info(val);
    }
}
