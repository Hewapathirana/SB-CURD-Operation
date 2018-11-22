package edu.bit.sms.scheduler.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "service_employee_map", schema = "schedular", catalog = "")
public class ServiceEmployeeMapEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Timestamp createDate;
    private Integer deleteStatus = 0;
    private Long employeeId;
    private Long servicesId;

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
    @Column(name = "DELETE_STATUS", nullable = true)
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = true)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "SERVICES_ID", nullable = true)
    public Long getServicesId() {
        return servicesId;
    }

    public void setServicesId(Long servicesId) {
        this.servicesId = servicesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceEmployeeMapEntity that = (ServiceEmployeeMapEntity) o;
        return id == that.id &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(servicesId, that.servicesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, deleteStatus, employeeId, servicesId);
    }
}
