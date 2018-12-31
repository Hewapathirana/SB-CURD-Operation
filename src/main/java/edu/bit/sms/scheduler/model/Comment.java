package edu.bit.sms.scheduler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Lob
    private String text;
    // uses the @JoinColumn annotation to declare the foreign key column.
    /*With this solution a unidirectional relationship from the child to the parent is enough to automatically
    remove all children. This solution does not need any listeners etc. Also a query like DELETE FROM Parent WHERE id = 1
    will remove the children.*/
    /*here we use @jsonignore bcz we dont want to serialize n deserialize the post property,
    * post property just used only inside comment module/entity*/
    //in manytoone or manytomany relations the fetchtype should lazy,if relation is onetoone then fetchtype is eager...
    /**
     * Both is used to prevent a null value, but if you mind that null should be blocked in ..
     * The database layer (and you want to generate the schema using JPA) --> use @Column(nullable=false)
     * The runtime (and before contacting the database)--> use optional=false (much faster than the first checking).
     * If you want both abilities, use them both
     * optional=false is a runtime instruction. The primary functional thing it does is related to Lazy Loading.
     * You can't lazy load a non-collection mapped entity unless you remember to set optional=false
     * (because Hibernate doesn't know if there should be a proxy there or a null,
     * unless you tell it nulls are impossible, so it can generate a proxy.)*/
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Post post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
