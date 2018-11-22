package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.AddresBookEntity;
import edu.bit.sms.scheduler.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@Service
public class AddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    /**
     * get all undeleted addresses
     * @param status
     * @return
     */
    public List<AddresBookEntity> getAllAddreses(int status) {
        return addressBookRepository.getAddresBookEntitiesByDeleteStatusIsNot(status);
    }

    /**
     * save address
     * @param addresBookEntity
     */
    public void saveAddresBook(AddresBookEntity addresBookEntity){
        addressBookRepository.save(addresBookEntity);
    }

    /**
     * search un deleted addresses using email
     * @param status
     * @param email
     * @return
     */
    public List<AddresBookEntity> getallUndeletedAddressByEmail(int status, String email){
        return addressBookRepository.getAddresBookEntitiesByDeleteStatusIsNotAndEmailIsLike(status,email);
    }

    /**
     * search un deleted addresses using email
     * @param status
     * @param firstname
     * @return
     */
    public List<AddresBookEntity> getallUndeletedAddressByFirstName(int status, String firstname){
        return addressBookRepository.getAddresBookEntitiesByDeleteStatusIsNotAndFirstNameIsLike(status,firstname);
    }

    /**
     * search un deleted addresses using email
     * @param status
     * @param lastname
     * @return
     */
    public List<AddresBookEntity> getallUndeletedAddressByLastName(int status, String lastname){
        return addressBookRepository.getAddresBookEntitiesByDeleteStatusIsNotAndLastNameIsLike(status,lastname);
    }

    /**
     * search un deleted addresses using user id
     * @param status
     * @param userId
     * @return
     */
    public AddresBookEntity getallUndeletedAddressByUserId(int status, Long userId){
        return addressBookRepository.getAddresBookEntityByDeleteStatusIsNotAndUserIdEquals(status,userId);
    }
}
