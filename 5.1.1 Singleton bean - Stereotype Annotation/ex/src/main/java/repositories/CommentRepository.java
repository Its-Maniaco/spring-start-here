package repositories;

import org.springframework.stereotype.Repository;

import models.Comment;

@Repository
public interface CommentRepository {
    void storeComment(Comment comment);
}
