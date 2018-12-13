package edu.bit.sms.scheduler.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usernew")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserModel implements Serializable {  /* The specification says you have to, but some JPA providers
                                                     do not enforce this. Hibernate as JPA provider does not enforce
                                                     this, but it can fail somewhere deep in its stomach with
                                                     ClassCastException, if Serializable has not been implemented.*/
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(name="user_name")
    private String name;
    @Column(name="user_email")
    private String email;

    public UserModel(){}/* Default constructor is required to have Hibernate initialize
                           the entity; private is allowed but package private (or public)
                           visibility is required for runtime proxy generation and efficient
                           data retrieval without bytecode instrumentation.*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
