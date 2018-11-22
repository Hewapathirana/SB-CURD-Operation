package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.AddresBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
public interface AddressBookRepository extends JpaRepository<AddresBookEntity,Long> {

    /**
     * get address according to delete status
     * @param status
     * @return
     */
    List<AddresBookEntity> getAddresBookEntitiesByDeleteStatusIsNot(int status);

    /**
     * search un deleted addresses using email
     * @param status
     * @param email
     * @return
     */
    List<AddresBookEntity> getAddresBookEntitiesByDeleteStatusIsNotAndEmailIsLike(int status, String email);

    /**
     * search un deleted addresses using first name
     * @param status
     * @param firstName
     * @return
     */
    List<AddresBookEntity> getAddresBookEntitiesByDeleteStatusIsNotAndFirstNameIsLike(int status, String firstName);

    /**
     * search un deleted addresses using last name
     * @param status
     * @param lastName
     * @return
     */
    List<AddresBookEntity> getAddresBookEntitiesByDeleteStatusIsNotAndLastNameIsLike(int status, String lastName);

    /**
     * search un deleted addresses using user ID
     * @param status
     * @param userID
     * @return
     */
    AddresBookEntity getAddresBookEntityByDeleteStatusIsNotAndUserIdEquals(int status, Long userID);

}
