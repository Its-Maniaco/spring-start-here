package proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import models.Comment;

@Component
@Primary // if we dont mark aa primary, we get error as 
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
