package ch4ex1;

import models.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        Comment comment = new Comment("Lauren", "Lauren ipsum text");

        commentService.publishComment(comment);

    }
}
