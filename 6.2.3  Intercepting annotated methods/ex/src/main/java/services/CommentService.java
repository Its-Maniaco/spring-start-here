package services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import annotations.ToLog;
import models.Comment;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    // custom annotation declared in Aspect and Annotations, used for method we want
    // aspect to intercept
    @ToLog
    public void delete(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
