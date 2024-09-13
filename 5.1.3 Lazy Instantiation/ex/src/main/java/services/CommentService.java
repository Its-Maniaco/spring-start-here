package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

// Constructor Injection
@Service
@Lazy // if we do not use this, CommentService will be created and instantizlied when
      // we create the context
public class CommentService {

    public CommentService() {
        System.out.println("Comment Service Created.");
    }
}