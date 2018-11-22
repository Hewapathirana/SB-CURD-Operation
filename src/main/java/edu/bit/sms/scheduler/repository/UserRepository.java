package edu.bit.sms.scheduler.repository;


import edu.bit.sms.scheduler.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    /**
     * get un deleted users
     * @param status
     * @return
     */
    List<UserEntity> getUserEntitiesByDeleteStatusIsNot(int status);

    /**
     * get user by user id
     * @param id
     * @return
     */
    UserEntity getUserEntityByIdEquals(Long id);


}
