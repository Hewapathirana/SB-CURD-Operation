package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "booking_item", schema = "schedular", catalog = "")
public class BookingItemEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String date;
    private Timestamp createDate;
    private Long bookingId;
    private Long servicesId;
    private Long employeeId;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DATE", nullable = true, length = 45)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "BOOKING_ID", nullable = true)
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "SERVICES_ID", nullable = true)
    public Long getServicesId() {
        return servicesId;
    }

    public void setServicesId(Long servicesId) {
        this.servicesId = servicesId;
    }

    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = true)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingItemEntity that = (BookingItemEntity) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(bookingId, that.bookingId) &&
                Objects.equals(servicesId, that.servicesId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, createDate, bookingId, servicesId, employeeId);
    }
}
