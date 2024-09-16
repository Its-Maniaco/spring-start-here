package ch5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class);

        CommentService cs1 = context.getBean(CommentService.class);
        UserService us2 = context.getBean(UserService.class);
        System.out.println(cs1.getCommentRepository() == us2.getCommentRepository());
    }
}
