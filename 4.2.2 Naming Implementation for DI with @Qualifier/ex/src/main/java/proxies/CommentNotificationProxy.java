package proxies;

import org.springframework.stereotype.Component;

import models.Comment;

@Component
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
