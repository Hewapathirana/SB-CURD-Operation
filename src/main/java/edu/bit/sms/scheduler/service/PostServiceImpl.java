package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.Post;
import edu.bit.sms.scheduler.repository.NewUserRepository;
import edu.bit.sms.scheduler.repository.PostRepository;
import edu.bit.sms.scheduler.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAllPosts() {
        //here findAllUsers returen type is usermodel list
        //database search
        //return all users
        List<Post> allPostshere= postRepository.findAll();
        //return  userRepository.findAll();
        return allPostshere;
    }

    @Override
    public String savePost(Post post) {
        postRepository.save(post);

        return " Posts saved";
    }

    @Override
    public String updatePost(Post post) {
        String msg=null;
        if(post.getId() !=null){
            postRepository.save(post);
            msg="Posts Updated";
        }

        else {msg ="post error update";}

        return msg;

    }

    @Override
    public Post findPostById(Long id) {
        return postRepository.getOne(id);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }


    @Override
    public boolean isPostAvailable(Long id) {

        if(postRepository.existsById(id)){
            return true;
        }
        else
        return false;
    }
}
