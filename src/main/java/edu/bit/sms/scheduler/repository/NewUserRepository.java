package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewUserRepository extends JpaRepository<UserModel,Long> {

}
