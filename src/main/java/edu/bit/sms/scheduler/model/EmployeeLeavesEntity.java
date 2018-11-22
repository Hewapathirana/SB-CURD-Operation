package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee_leaves", schema = "schedular", catalog = "")
public class EmployeeLeavesEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String leaveType;
    private Timestamp createDate;
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
    @Column(name = "LEAVE_TYPE", nullable = true, length = 45)
    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
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
        EmployeeLeavesEntity that = (EmployeeLeavesEntity) o;
        return id == that.id &&
                Objects.equals(leaveType, that.leaveType) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleteStatus, that.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, leaveType, createDate, deleteStatus);
    }
}
