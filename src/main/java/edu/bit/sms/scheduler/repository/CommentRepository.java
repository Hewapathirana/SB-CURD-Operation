package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.Comment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.LongSummaryStatistics;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    Page<Comment> findByPostId(Long postId, Pageable pageable);

    @Query(value = "select * from comments where post_id= :postIdv", nativeQuery = true)
    List<Comment> findCommentsByPostId(@Param("postIdv") Long postIdv);

    // to delete all comments belongs to a post
    Long deleteByPostId(Long postid);



}
