package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import models.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {
    // dependencies for CommentService
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            // For each parameter where we want to use a specific implementation, we
            // annotate the parameter with @Qualifier.
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
