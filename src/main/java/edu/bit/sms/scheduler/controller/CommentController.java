package edu.bit.sms.scheduler.controller;


import edu.bit.sms.scheduler.model.Comment;
import edu.bit.sms.scheduler.model.Post;
import edu.bit.sms.scheduler.repository.CommentRepository;
import edu.bit.sms.scheduler.repository.PostRepository;
import edu.bit.sms.scheduler.service.interfaces.CommentService;
import edu.bit.sms.scheduler.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author dasitha
 * @since 2018-12-20
 */
@RestController
@RequestMapping(path = "/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @Autowired
    private PostService postService;



    //should be remove
    @Autowired
    private CommentRepository commentRepository;

    //should be remove
    @Autowired
    private PostRepository postRepository;



    @GetMapping("/posts/{postId}/comments")
    public Page<Comment> getAllCommentsByPostId(@PathVariable (value = "postId") Long postId,
                                                Pageable pageable) {
        return commentRepository.findByPostId(postId, pageable);
    }

    @GetMapping("/postsnopageble/{postId}/comments")
    public List<Comment> getAllCommentsByPostIdNoPage(@PathVariable (value = "postId") Long postId
                                                ) {
        return commentService.findCommentsByPostIdservice(postId);
    }


    @PostMapping("/posts/{postId}/comments")
    public Comment createComment(@PathVariable(value = "postId") Long postId,
                                 @Valid @RequestBody Comment comment) {

        Post postidforcomment=postService.findPostById(postId);

         comment.setPost(postidforcomment);
          commentService.saveComment(comment);
       return comment;
    }


    @PutMapping("/posts/{postId}/comments/{commentId}")
    public Comment updateComment(@PathVariable (value = "postId") Long postId,
                                 @PathVariable (value = "commentId") Long commentId,
                                 @Valid @RequestBody Comment commentRequest) {
        if(!postRepository.existsById(postId)) {
            System.out.println(("PostId " + postId + " not found"));
        }
      else if(postRepository.existsById(postId)){
            Comment commentupdate=commentService.findCommentById(commentId);
            commentupdate.setText(commentRequest.getText());
            commentService.saveComment(commentupdate);
            return commentupdate;
        }

        return null;
    }






}
