package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.Comment;
import edu.bit.sms.scheduler.repository.CommentRepository;
import edu.bit.sms.scheduler.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {


    @Autowired
    private CommentRepository commentRepository;



    @Override
    public List<Comment> findAllComments() {
        //here findAllUsers returen type is usermodel list
        //database search
        //return all users
        List<Comment> allcommentshere= commentRepository.findAll();
        //return  userRepository.findAll();
        return allcommentshere;
    }

    @Override
    public String saveComment(Comment comment) {
        commentRepository.save(comment);

        return " comment saved";
    }

    @Override
    public String updateComment(Comment comment) {
        String msg=null;
        if(comment.getId() !=null){
            commentRepository.save(comment);
            msg="Comments Updated";
        }

        else {msg ="comment error update";}

        return msg;

    }

    @Override
    public Comment findCommentById(Long id) {
        return commentRepository.getOne(id);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> findCommentsByPostIdservice(Long pstId) {
        List<Comment> allpostcommentsshere= commentRepository.findCommentsByPostId(pstId);
        //return  userRepository.findAll();
        return allpostcommentsshere;
    }


    @Override
    public boolean isCommentAvailable(Long id) {

        if(commentRepository.existsById(id)){
            return true;
        }
        else
        return false;
    }
}
