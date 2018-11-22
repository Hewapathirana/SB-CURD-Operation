package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "addres_book", schema = "schedular", catalog = "")
public class AddresBookEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Timestamp createdDate;
    private String firstName;
    private String lastName;
    private String unitNo;
    private String street;
    private String suburb;
    private String state;
    private String postalCode;
    private String country;
    private Long userId;
    private String phone;
    private String email;
    private Integer deleteStatus = 0;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATED_DATE", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "UNIT_NO", nullable = true, length = 45)
    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "SUBURB", nullable = true, length = 45)
    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "POSTAL_CODE", nullable = true, length = 45)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DELETE_STATUS", nullable = true)
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddresBookEntity that = (AddresBookEntity) o;
        return id == that.id &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(unitNo, that.unitNo) &&
                Objects.equals(street, that.street) &&
                Objects.equals(suburb, that.suburb) &&
                Objects.equals(state, that.state) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(country, that.country) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(deleteStatus, that.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDate, firstName, lastName, unitNo, street, suburb, state, postalCode, country, userId, phone, email, deleteStatus);
    }
}
