package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.Comment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    Page<Comment> findByPostId(Long postId, Pageable pageable);

    @Query(value = "select * from comments where post_id= ?", nativeQuery = true)
    List<Comment> findCommentsByPostId(Long postIdv);
}
