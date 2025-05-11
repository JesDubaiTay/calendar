package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Entity(name = "Position")
@Table(name = "DF_POSITION")
public class Position {

    @Id
    @Column(name = "ID")
    @JmixGeneratedValue
    private UUID id;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Column(name = "NAME", length = 400)
    @NotNull
    @InstanceName
    private String name;

    @SystemLevel
    @Column(name = "CREATE_TS")
    private Date createTs;

    @SystemLevel
    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @SystemLevel
    @Column(name = "UPDATE_TS")
    private Date updateTs;

    @SystemLevel
    @Column(name = "UPDATED_BY", length = 50)
    private String updatedBy;

    @SystemLevel
    @Column(name = "DELETE_TS")
    private Date deleteTs;

    @SystemLevel
    @Column(name = "DELETED_BY", length = 50)
    private String deletedBy;

   // @OneToMany(mappedBy = "position") // Связь с сотрудниками (Employee -> position)
    //private List<Employee> employees; // Сотрудники (1:N)

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    //public List<Employee> getEmployees() {
      //  return employees;
   // }

    //public void setEmployees(List<Employee> employees) {
    //    this.employees = employees;
    //}

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", version=" + version +
                ", name='" + name + '\'' +
                '}';
    }
}