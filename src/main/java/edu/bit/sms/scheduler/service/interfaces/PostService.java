package edu.bit.sms.scheduler.service.interfaces;

import edu.bit.sms.scheduler.model.Post;

import java.util.List;

public interface PostService {
    //we should provide methods here for crud

    //to get values from the databse
    List<Post> findAllPosts();

    //to save values for the database
    String savePost(Post post);

    //to update posts
    String updatePost(Post post);


    //find a post by id
    Post findPostById(Long id);


    void deletePost(Long id);
}
