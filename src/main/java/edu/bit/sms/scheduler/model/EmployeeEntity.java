package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "schedular", catalog = "")
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Timestamp createDate;
    private Integer employeeInTime;
    private Integer employeeOutTime;
    private Double employeeRate;
    private String employeeStatus;
    private Long userId;

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "EMPLOYEE_IN_TIME", nullable = true)
    public Integer getEmployeeInTime() {
        return employeeInTime;
    }

    public void setEmployeeInTime(Integer employeeInTime) {
        this.employeeInTime = employeeInTime;
    }

    @Basic
    @Column(name = "EMPLOYEE_OUT_TIME", nullable = true)
    public Integer getEmployeeOutTime() {
        return employeeOutTime;
    }

    public void setEmployeeOutTime(Integer employeeOutTime) {
        this.employeeOutTime = employeeOutTime;
    }

    @Basic
    @Column(name = "EMPLOYEE_RATE", nullable = true, precision = 0)
    public Double getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(Double employeeRate) {
        this.employeeRate = employeeRate;
    }

    @Basic
    @Column(name = "EMPLOYEE_STATUS", nullable = true, length = 45)
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return id == that.id &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(employeeInTime, that.employeeInTime) &&
                Objects.equals(employeeOutTime, that.employeeOutTime) &&
                Objects.equals(employeeRate, that.employeeRate) &&
                Objects.equals(employeeStatus, that.employeeStatus) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, employeeInTime, employeeOutTime, employeeRate, employeeStatus, userId);
    }
}
