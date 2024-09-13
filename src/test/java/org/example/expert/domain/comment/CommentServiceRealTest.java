package org.example.expert.domain.comment;

import org.example.expert.domain.comment.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentServiceRealTest {
    @Autowired
    private CommentService commentService;

    @Test
    public void 댓글_실제_테스트(){    // postman이랑 동일하다고 생각하면 됨!
        commentService.deleteComments(1L);
    }
}
