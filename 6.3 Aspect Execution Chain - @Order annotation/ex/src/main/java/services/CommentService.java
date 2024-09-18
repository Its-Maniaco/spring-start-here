package services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import annotations.ToLog;
import models.Comment;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

}
