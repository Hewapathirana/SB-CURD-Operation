package edu.bit.sms.scheduler.service.interfaces;

import edu.bit.sms.scheduler.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {
    //we should provide methods here for crud

    //to get values from the databse
    List<Comment> findAllComments();

    //to save values for the database
    String saveComment(Comment comment);

    //to update posts
    String updateComment(Comment comment);


    //find a post by id
    Comment findCommentById(Long id);


    void deleteComment(Long id);


    //to find all comments relavent to posts
    //Page<Comment> findByPostId(Long postId, Pageable pageable);


    List<Comment> findCommentsByPostIdservice(Long pstId);
}
