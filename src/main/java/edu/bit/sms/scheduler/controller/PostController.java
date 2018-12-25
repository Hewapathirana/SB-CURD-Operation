package edu.bit.sms.scheduler.controller;


import edu.bit.sms.scheduler.model.Post;
import edu.bit.sms.scheduler.repository.CommentRepository;
import edu.bit.sms.scheduler.service.interfaces.CommentService;
import edu.bit.sms.scheduler.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dasitha
 * @since 2018-12-20
 */
@RestController
@RequestMapping(path = "/post")
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepository commentRepository;//remove


    @GetMapping("/allposts")
    public List<Post>  allPosts(){
        return postService.findAllPosts();
    }

    @PostMapping("/saveposts")
    public String savePosts(@RequestBody Post post){
        return postService.savePost(post);
    }

    @PutMapping("/updatepost/{id}")
    public Post updatePost(@PathVariable(value = "id") Long noteId,
                                   @RequestBody Post post){
        Post postupdate=postService.findPostById(noteId);
        postupdate.setTitle(post.getTitle());
        postupdate.setDescription(post.getDescription());
        postupdate.setContent(post.getContent());
        postService.savePost(postupdate);
        return postupdate;
    }

    @GetMapping("/findpost/{id}")
    public Post getPostById(@PathVariable(value = "id") Long noteId){//@PathVariable Long id

        return postService.findPostById(noteId);
    }

    @DeleteMapping("/allUsers/delete/{id}")
    public void deletePostById(@PathVariable Long id){
        commentService.deleteAllCommentsForPostId(id);
        //commentRepository.deleteByPostId(id);
        postService.deletePost(id);

        System.out.println("deleted post =" + id);
    }

}
